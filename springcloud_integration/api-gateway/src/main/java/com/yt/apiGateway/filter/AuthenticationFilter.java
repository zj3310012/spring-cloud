package com.yt.apiGateway.filter;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.yt.apiGateway.constants.HttpMessageParams;
import com.yt.apiGateway.enums.HttpResponseStatus;
import com.yt.apiGateway.utils.LocalMapUtil;
import com.yt.apiGateway.utils.StreamUtil;

/**
 * 鉴权过滤器
 * 
 * @author zhangjing 
 * date: 2019年3月29日 上午10:59:17
 */
public class AuthenticationFilter extends ZuulFilter {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationFilter.class);

	@Value("${apiGateway.zuul.route-prefix}")
	private String routePrefix;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext requestContext = RequestContext.getCurrentContext();
		HttpServletRequest request = requestContext.getRequest();
		String uri = request.getRequestURI();
		String method = request.getMethod();
		String visitUrl = uri.replace(routePrefix, "");
		String data = "";
		if (method.toUpperCase().equals("GET")) {
			data = request.getParameter(HttpMessageParams.REQUEST_PARAMS);
		} else if (method.toUpperCase().equals("POST")) {
			InputStream inputStream;
			try {
				inputStream = request.getInputStream();
				data = StreamUtil.readString(inputStream, HttpMessageParams.CHARACTER_ENCODING);
			} catch (IOException e) {
				LOGGER.error("数据不合法", e);
				setErrorResponse(requestContext, HttpResponseStatus.DATA_INVALID);
			}
		}

		String requestType = "GET";
		JSONObject requestBody = JSONObject.parseObject(data);
		String userCode = requestBody.getString(HttpMessageParams.USERCODE);
		Map<String, String> params = new HashMap<String, String>();
		params.put(HttpMessageParams.VISIT_URL, visitUrl);
		params.put(HttpMessageParams.REQUEST_TYPE, requestType);
		params.put(HttpMessageParams.USERCODE, userCode);
		ThreadLocal<String> threadLocal = LocalMapUtil.threadLocal;
		threadLocal.set(userCode);
		// SSO鉴权

		ResponseEntity<String> responseEntity = restTemplate.getForEntity(
				"http://UCENTER/open/api/v1/auth/authority?userCode={userCode}&requestType={requestType}&visitUrl={visitUrl}",
				String.class, params);
		String body = responseEntity.getBody();
		JSONObject responseBody = JSONObject.parseObject(body);
		String code = responseBody.getString(HttpMessageParams.CODE);
		String msg = responseBody.getString(HttpMessageParams.MSG);
		if (!code.equals(String.valueOf(HttpResponseStatus.OK.getCode()))) {
			HttpResponseStatus status = HttpResponseStatus.AUTHENTICATION_FAILURE;
			status.setCode(Integer.valueOf(code));
			status.setDesc(msg);
			setErrorResponse(requestContext, status);
		}
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return FilterConstants.PRE_DECORATION_FILTER_ORDER - 2;
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

}
