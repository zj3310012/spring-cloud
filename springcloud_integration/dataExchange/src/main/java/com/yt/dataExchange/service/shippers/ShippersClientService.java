package com.yt.dataExchange.service.shippers;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.yt.coreapi.serivce.ShippersService;

/**
 * 
 * @author zhangjing
 * date: 2019年3月1日 下午5:44:13
 */
@FeignClient("uniPlatform")
public interface ShippersClientService extends ShippersService{

}
