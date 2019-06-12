package com.yt.apiGateway.filter;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import com.alibaba.fastjson.JSONObject;
import com.netflix.zuul.context.RequestContext;
import com.yt.apiGateway.constants.HttpMessageParams;
import com.yt.apiGateway.enums.HttpResponseStatus;
import com.yt.apiGateway.utils.StreamUtil;

/**
 * 响应过滤器
 * 
 * @author zhangjing 
 * date: 2019年3月26日 上午11:04:23
 */
public class ResponseFilter extends AbstractResponseFilter {

	private static final Logger LOGGER = LoggerFactory.getLogger(ResponseFilter.class);

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext requestContext = RequestContext.getCurrentContext();
		HttpServletResponse response = requestContext.getResponse();
		response.setContentType("application/json; charset=utf-8");
		response.setCharacterEncoding(HttpMessageParams.CHARACTER_ENCODING);
		InputStream inputStream = requestContext.getResponseDataStream();
		String body = requestContext.getResponseBody();	
		try {
			int code = requestContext.getResponseStatusCode();
			// 如果是服务连接异常就直接返回不做处理
			if(code == HttpResponseStatus.CONNECTION_EXCEPTION.getCode()) {
				return null;
			}
			// 还不清楚responseBody和responseDataStream的区别，就按照SendResponseFilter写吧，o(╥﹏╥)o
			if (StringUtils.isNotBlank(body)) {
				String responseStr = getResponse(body);
				requestContext.setResponseBody(responseStr);
				return null;
			}
			if (inputStream != null) {
				String data = StreamUtil.readString(inputStream, HttpMessageParams.CHARACTER_ENCODING);
				
				if (StringUtils.isBlank(data)) {
					responseErrorBody(HttpResponseStatus.NO_INFORMATION_QUERY,requestContext);
					return null;
				}
				if(code == 405) {
					HttpResponseStatus reponseStatus = HttpResponseStatus.REQUEST_ERROR;
					reponseStatus.setDesc(JSONObject.parse(data));
					responseErrorBody(reponseStatus,requestContext);
					return null;
				}
				String responseStr = getResponse(data);
				InputStream is = new ByteArrayInputStream(responseStr.getBytes(HttpMessageParams.CHARACTER_ENCODING));
				requestContext.setResponseDataStream(is);
				inputStream.close();
				return null;
			}
			// 空数据返回未查询到信息
			responseErrorBody(HttpResponseStatus.NO_INFORMATION_QUERY,requestContext);

		} catch (Exception e) {
			LOGGER.error("系统异常",e);
			responseErrorBody(HttpResponseStatus.SYSTEM_EXCEPTION,requestContext);
		}
		return null;
	}

	@Override
	public String filterType() {
		return "post";
	}

	@Override
	public int filterOrder() {
		// post顺序 在0-1000之内
		return FilterConstants.SEND_RESPONSE_FILTER_ORDER - 1;
	}

}
