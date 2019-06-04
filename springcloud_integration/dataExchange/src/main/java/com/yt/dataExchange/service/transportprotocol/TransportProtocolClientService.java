package com.yt.dataExchange.service.transportprotocol;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.yt.coreapi.serivce.TransportProtocolService;

/**
 * 
 * @author zhangjing
 * date: 2019年2月22日 下午4:49:42
 */
@FeignClient("uniPlatform")
public interface TransportProtocolClientService extends TransportProtocolService{

}
