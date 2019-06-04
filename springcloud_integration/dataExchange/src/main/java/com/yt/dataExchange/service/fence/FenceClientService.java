package com.yt.dataExchange.service.fence;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.yt.coreapi.serivce.FenceSerivce;

@FeignClient("uniPlatform")
public interface FenceClientService extends FenceSerivce{

}
