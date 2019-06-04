package com.zj.dataExchange.service.commits.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.yt.coreapi.serivce.CommitsService;

/**
 * 
 * @author zhangjing
 * date: 2019年3月5日 下午6:03:39
 */
@FeignClient("uniPlatform")
public interface CommitsClientService extends CommitsService{

}
