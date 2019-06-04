package com.zj.apiGateway.config;

import java.nio.charset.Charset;
import java.util.List;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.zj.apiGateway.constants.HttpMessageParams;
import com.zj.apiGateway.filter.AuthenticationFilter;
import com.zj.apiGateway.filter.ErrorFilter;
import com.zj.apiGateway.filter.RequestFilter;
import com.zj.apiGateway.filter.ResponseFilter;

/**
 * 
 * @author zhangjing date: 2019年4月1日 下午4:05:40
 */
@Configuration
public class FilterConfig {

	@Bean
	public AuthenticationFilter getAuthenticationFilter() {
		return new AuthenticationFilter();
	}

	@Bean
	public RequestFilter accessFilter() {
		return new RequestFilter();
	}

	@Bean
	public ResponseFilter returnFilter() {
		return new ResponseFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		// 返回字符串utf-8格式
		RestTemplate restTemplate = new RestTemplate();
		List<HttpMessageConverter<?>> list = restTemplate.getMessageConverters();
		for (HttpMessageConverter<?> httpMessageConverter : list) {
			if (httpMessageConverter instanceof StringHttpMessageConverter) {
				((StringHttpMessageConverter) httpMessageConverter)
						.setDefaultCharset(Charset.forName(HttpMessageParams.CHARACTER_ENCODING));
				break;
			}
		}
		return restTemplate;
	}
}