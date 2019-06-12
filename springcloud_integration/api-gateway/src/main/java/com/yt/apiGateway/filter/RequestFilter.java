package com.yt.apiGateway.filter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import com.alibaba.fastjson.JSONObject;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.yt.apiGateway.constants.HttpMessageParams;
import com.yt.apiGateway.dataObject.UserDO;
import com.yt.apiGateway.enums.HttpResponseStatus;
import com.yt.apiGateway.mapper.UserMapper;
import com.yt.apiGateway.utils.AESUtil;
import com.yt.apiGateway.utils.LocalMapUtil;
import com.yt.apiGateway.utils.OrdersUtil;
import com.yt.apiGateway.utils.SignForDSA;
import com.yt.apiGateway.utils.StreamUtil;
import com.yt.apiGateway.wrapper.HttpServletRequestWrapperForGet;
import com.yt.apiGateway.wrapper.HttpServletRequestWrapperForPost;

/**
 * 请求接收过滤器
 * 
 * @author zhangjing 
 * date: 2019年3月26日 上午10:56:12
 */
public class RequestFilter extends ZuulFilter {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RequestFilter.class);
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext requestContext = RequestContext.getCurrentContext();
		HttpServletRequest request = requestContext.getRequest();
		HttpServletResponse response = requestContext.getResponse();
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.setCharacterEncoding(HttpMessageParams.CHARACTER_ENCODING);
		try {
			String method = request.getMethod();
			// 查询详情 get请求
			if (method.toUpperCase().equals("GET")) {
				HttpServletRequestWrapperForGet requestWrapper = new HttpServletRequestWrapperForGet(
						(HttpServletRequest) request);
				String requestParams = requestWrapper.getParameter(HttpMessageParams.REQUEST_PARAMS);
				if (StringUtils.isNotBlank(requestParams)) {
					handleData(requestParams, requestContext, method, requestWrapper, null);
				}

				Map<String, String[]> map = requestWrapper.getParams();
				Map<String, List<String>> paramsMap = new HashMap<String, List<String>>();
				for (Map.Entry<String, String[]> entry : map.entrySet()) {
					paramsMap.put(entry.getKey(), Arrays.asList(entry.getValue()));
				}
				//get请求只能设置requestQueryParams有效
				requestContext.setRequestQueryParams(paramsMap);
			}
			// 查询列表 post请求
			else if (method.toUpperCase().equals("POST")) {
				// 读取请求内容
				InputStream inputStream = request.getInputStream();
				HttpServletRequestWrapperForPost requestWrapper = new HttpServletRequestWrapperForPost(
						(HttpServletRequest) request, HttpMessageParams.CHARACTER_ENCODING);
				String data = StreamUtil.readString(inputStream, HttpMessageParams.CHARACTER_ENCODING);
				// 将json字符串转换为json对象
				if (StringUtils.isNotBlank(data)) {
					handleData(data, requestContext, method, null, requestWrapper);
				}
				requestContext.setRequest(requestWrapper);
			}
		} catch (IOException e) {
			LOGGER.error("IO解析异常",e);
			setErrorResponse(requestContext,HttpResponseStatus.ILLEGAL_CHARACTER);
		}
		return null;
	}

	private void handleData(String requestParams, RequestContext requestContext, String method,
			HttpServletRequestWrapperForGet requestWrapperForGet,
			HttpServletRequestWrapperForPost requestWrapperForPost) {
		JSONObject requestBody = JSONObject.parseObject(requestParams);

		// 获取userCode
		String userCode = requestBody.getString(HttpMessageParams.USERCODE);
		//从本地缓存中获取第三方签名公钥和加密秘钥
		Map<String,UserDO> userInfo = LocalMapUtil.userInfo;
		UserDO user = userInfo.get(userCode);
		if(user == null) {
			//从database中获取第三方签名公钥和加密秘钥
			user = userMapper.queryUserByUserCode(userCode);
			if(user ==null) {
				setErrorResponse(requestContext,HttpResponseStatus.USER_INFORMATION_MISSING);
				return;
			}
			userInfo.put(userCode, user);
			
		}
		// 第三方验证签名公钥
		String thridPublicKey = user.getPublicKey();
		// 第三方解密秘钥
		String thridPassword = user.getSymmetryKey();
		if(StringUtils.isBlank(thridPublicKey) || StringUtils.isBlank(thridPassword)) {
			setErrorResponse(requestContext,HttpResponseStatus.SECRET_KEY_MISSING);
		}
		
		int isUse = user.getIsUse();
		if(isUse != 1) {
			setErrorResponse(requestContext,HttpResponseStatus.USER_CODE_UNAVAILABLE);
			return;
		}
		
		// 获取加密请求参数
		String entryptParams = requestBody.getString(HttpMessageParams.PARAMS);
		// 获取签名
		String sign = requestBody.getString(HttpMessageParams.SIGN);
		if (StringUtils.isNotBlank(userCode) && StringUtils.isNotBlank(entryptParams) && StringUtils.isNotBlank(sign)) {
			// 获取解密请求参数字符串
			String params;
			try {
				params = AESUtil.AESDncode(entryptParams, thridPassword);
			} catch (Exception e) {
				LOGGER.error("解密参数异常",e);
				setErrorResponse(requestContext,HttpResponseStatus.PARAMETER_DECRYPTION_EXCEPTION);
				return;
			}
			// 对请求字符串按升序排序
			JSONObject jsonParams = JSONObject.parseObject(params);
			String orderParams = OrdersUtil.sortKeyValue(jsonParams);
			// 验签
			boolean flag;
			try {
				flag = SignForDSA.verify(orderParams.getBytes(), thridPublicKey, sign);
				if (flag) {
					// get请求转换
					if (method.toUpperCase().equals("GET")) {
						requestWrapperForGet.setParams(jsonParams);
						// post请求转换
					} else if (method.toUpperCase().equals("POST")) {
						requestWrapperForPost.setBody(params.getBytes());
					}

				} else {
					setErrorResponse(requestContext,HttpResponseStatus.SIGNATURE_VERIFICATION_FAILED);

				}
			} catch (Exception e) {
				LOGGER.error("验签异常",e);
				setErrorResponse(requestContext,HttpResponseStatus.SIGNATURE_VERIFICATION_EXCEPTION);
				return;
			}

		} else {
			setErrorResponse(requestContext,HttpResponseStatus.REQUEST_PARAMETER_MISSING);
		}

	}
	
	private void setErrorResponse(RequestContext requestContext, HttpResponseStatus status) {
		requestContext.setResponseStatusCode(status.getCode());
		JSONObject json = new JSONObject();
		json.put(HttpMessageParams.CODE, status.getCode());
		json.put(HttpMessageParams.DATA, "");
		json.put(HttpMessageParams.MSG, status.getDesc());
		requestContext.setResponseBody(json.toString());
		requestContext.setSendZuulResponse(false);
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return FilterConstants.PRE_DECORATION_FILTER_ORDER -1;
	}

}
