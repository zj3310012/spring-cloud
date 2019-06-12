package com.zj.dataExchange.service.transportprotocol.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 
 * @author zhangjing
 * date: 2019年2月22日 下午4:49:42
 */
@FeignClient("uniPlatform")
public interface TransportProtocolClientService extends TransportProtocolService{

}
