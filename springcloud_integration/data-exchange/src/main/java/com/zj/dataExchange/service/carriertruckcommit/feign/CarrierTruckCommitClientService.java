package com.zj.dataExchange.service.carriertruckcommit.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 
 * @author zhangjing
 * date: 2019年3月4日 下午5:07:45
 */
@FeignClient("uni-platform")
public interface CarrierTruckCommitClientService extends CarrierTruckCommitService{

}
