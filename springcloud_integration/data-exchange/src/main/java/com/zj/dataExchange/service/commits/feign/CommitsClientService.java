package com.zj.dataExchange.service.commits.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 
 * @author zhangjing
 * date: 2019年3月5日 下午6:03:39
 */
@FeignClient("uni-platform")
public interface CommitsClientService extends CommitsService{

}
