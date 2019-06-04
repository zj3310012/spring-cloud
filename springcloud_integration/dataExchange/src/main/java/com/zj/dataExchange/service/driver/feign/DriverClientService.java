package com.zj.dataExchange.service.driver.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.yt.coreapi.serivce.DriverService;

@FeignClient("uniPlatform")
public interface DriverClientService extends DriverService{

}
