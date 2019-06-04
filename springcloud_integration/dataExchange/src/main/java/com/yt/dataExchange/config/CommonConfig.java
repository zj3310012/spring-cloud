package com.yt.dataExchange.config;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfig {

	@Bean
	public AlwaysSampler alwaysSampler() {
		return new AlwaysSampler();
	}
}
