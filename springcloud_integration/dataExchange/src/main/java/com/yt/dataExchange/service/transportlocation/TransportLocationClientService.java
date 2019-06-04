package com.yt.dataExchange.service.transportlocation;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.yt.coreapi.serivce.TransportLocationService;

/**
 * 
 * @author zhangjing
 * date: 2019年2月25日 下午4:58:20
 */
@FeignClient("uniPlatform")
public interface TransportLocationClientService extends TransportLocationService{

}
