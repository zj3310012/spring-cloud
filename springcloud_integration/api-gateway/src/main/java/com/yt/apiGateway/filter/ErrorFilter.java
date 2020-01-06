package com.yt.apiGateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.netflix.zuul.filters.post.SendErrorFilter;

import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.yt.apiGateway.enums.HttpResponseStatus;

/**
 * 统一错误返回
 * 
 * @author zhangjing
 * Date:2019年11月29日下午9:17:21
 */
@ConditionalOnProperty(name="zuul.SendErrorFilter.error.disable")
public class ErrorFilter extends SendErrorFilter{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ErrorFilter.class);
	
	@Autowired
	private ResponseFilter responseFilter;

    @Override
    public String filterType() {
        return super.filterType();
    }

    @Override
    public int filterOrder() {
        return super.filterOrder();
    }

    @Override
    public boolean shouldFilter() {
        return super.shouldFilter();
    }
    
	@Override
	public Object run() {
		RequestContext requestContext = RequestContext.getCurrentContext();
		Object e = requestContext.get("throwable");
		if (e != null && e instanceof ZuulException) {
			LOGGER.error("系统错误", e);
			responseFilter.responseErrorBody(HttpResponseStatus.CONNECTION_EXCEPTION, requestContext);
			
			// 删除该异常信息,不然在下一个过滤器中还会被执行处理
			// requestContext.remove("throwable");
			// 根据具体的业务逻辑来处理
			requestContext.setResponseStatusCode(HttpResponseStatus.CONNECTION_EXCEPTION.getCode());
		}
		return null;
	}

}
