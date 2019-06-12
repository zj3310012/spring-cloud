package com.zj.dataExchange.service.driver.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("uniPlatform")
public interface DriverClientService extends DriverService{

}
