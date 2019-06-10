package com.zj.dataExchange.service.shippers.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 
 * @author zhangjing
 * date: 2019年3月1日 下午5:44:13
 */
@FeignClient("uniPlatform")
public interface ShippersClientService extends ShippersService{

}