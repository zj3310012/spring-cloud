package com.zj.dataExchange.service.driver.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("uni-platform")
public interface DriverClientService extends DriverService{

}
