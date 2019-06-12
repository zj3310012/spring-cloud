package com.zj.dataExchange.service.truck.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 
 * @author zhangjing
 * date: 2019年3月1日 上午10:36:45
 */
@FeignClient("uni-platform")
public interface TruckClientService extends TruckService{

}
