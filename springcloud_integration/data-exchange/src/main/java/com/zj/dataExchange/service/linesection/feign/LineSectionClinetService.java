package com.zj.dataExchange.service.linesection.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 
 * @author zhangjing
 * date: 2019年3月25日 上午11:23:13
 */
@FeignClient("uni-platform")
public interface LineSectionClinetService extends LineSectionSerivce{

}
