package com.zj.apiGateway.wrapper;

import java.io.IOException;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import com.netflix.zuul.http.ServletInputStreamWrapper;

/**
 * 转换json报文请求
 * 
 * @author zhangjing 
 * date: 2019年3月26日 下午2:08:30
 */
public class HttpServletRequestWrapperForPost extends HttpServletRequestWrapper {

	private byte[] body; // 用于保存读取body中数据

	public HttpServletRequestWrapperForPost(HttpServletRequest request, String characterencoding) throws IOException {
		super(request);
	}

	// 覆盖（重写）父类获取流的方法
	@Override
	public ServletInputStream getInputStream() throws IOException {
		return new ServletInputStreamWrapper(body);
	}

	/**
	 * 把处理后的参数放到body里面
	 * 
	 * @param body
	 */
	public void setBody(byte[] body) {
		this.body = body;
	}

	@Override
	public int getContentLength() {
		return body.length;
	}

	// RibbonRoutingFilter:
	// To support Servlet API 3.1 we need to check if getContentLengthLong exists
	@Override
	public long getContentLengthLong() {
		return body.length;
	}

}
