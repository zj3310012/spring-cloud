package com.zj.dataExchange.service.linesection.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.yt.coreapi.serivce.LineSectionSerivce;

/**
 * 
 * @author zhangjing
 * date: 2019年3月25日 上午11:23:13
 */
@FeignClient("uniPlatform")
public interface LineSectionClinetService extends LineSectionSerivce{

}
