package com.zj.dataExchange.service.line.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.yt.coreapi.serivce.LineService;

/**
 * 
 * @author zhangjing
 * date: 2019年2月26日 下午3:58:06
 */
@FeignClient("uniPlatform")
public interface LineClientService extends LineService{

}
