package com.zj.dataExchange.service.carriertruckcommit.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.yt.coreapi.serivce.CarrierTruckCommitService;

/**
 * 
 * @author zhangjing
 * date: 2019年3月4日 下午5:07:45
 */
@FeignClient("uniPlatform")
public interface CarrierTruckCommitClientService extends CarrierTruckCommitService{

}
