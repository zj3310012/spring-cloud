package com.zj.dataExchange.service.fence.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("uni-platform")
public interface FenceClientService extends FenceSerivce{

}
