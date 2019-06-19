package com.zj.sidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

//@EnableSidecar是一个组合注解, 它整合了三个注解, 
//分别是：@EnableCircuitBreaker、@EnableDiscoveryClient、@EnableZuulProxy
@EnableSidecar
@SpringBootApplication
public class SidecarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SidecarApplication.class, args);
	}

}

