package com.zj.apiGateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.zj.apiGateway.enums.HttpResponseStatus;

/**
 * 使用自定义的错误过滤器
 * 
 * @author zhangjing 
 * date: 2019年4月9日 下午3:38:07
 */
public class ErrorFilter extends AbstractResponseFilter {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ErrorFilter.class);

	@Override
	public boolean shouldFilter() {
		return RequestContext.getCurrentContext().containsKey("throwable");
	}

	@Override
	public Object run() {
		RequestContext requestContext = RequestContext.getCurrentContext();
		Object e = requestContext.get("throwable");
		if (e != null && e instanceof ZuulException) {
			ZuulException zuulException = (ZuulException) e;
			LOGGER.error("系统错误", zuulException);
			responseErrorBody(HttpResponseStatus.CONNECTION_EXCEPTION, requestContext);
			// 删除该异常信息,不然在下一个过滤器中还会被执行处理
			requestContext.remove("throwable");
			// 根据具体的业务逻辑来处理
			requestContext.setResponseStatusCode(HttpResponseStatus.CONNECTION_EXCEPTION.getCode());
		}
		return null;
	}

	@Override
	public String filterType() {
		return FilterConstants.ERROR_TYPE;
	}

	@Override
	public int filterOrder() {
		return FilterConstants.SEND_ERROR_FILTER_ORDER - 1;
	}

}
