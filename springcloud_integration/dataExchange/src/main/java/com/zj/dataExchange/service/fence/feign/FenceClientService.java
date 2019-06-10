package com.zj.dataExchange.service.fence.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("uniPlatform")
public interface FenceClientService extends FenceSerivce{

}
