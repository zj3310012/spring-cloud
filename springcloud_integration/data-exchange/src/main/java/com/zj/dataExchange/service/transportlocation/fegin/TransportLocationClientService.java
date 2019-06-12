package com.zj.dataExchange.service.transportlocation.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 
 * @author zhangjing
 * date: 2019年2月25日 下午4:58:20
 */
@FeignClient("uniPlatform")
public interface TransportLocationClientService extends TransportLocationService{

}
