package com.zj.dataExchange.service.truck.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.yt.coreapi.serivce.TruckService;

/**
 * 
 * @author zhangjing
 * date: 2019年3月1日 上午10:36:45
 */
@FeignClient("uniPlatform")
public interface TruckClientService extends TruckService{

}
