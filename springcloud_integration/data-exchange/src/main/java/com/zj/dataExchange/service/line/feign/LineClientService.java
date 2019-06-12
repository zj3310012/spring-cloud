package com.zj.dataExchange.service.line.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 
 * @author zhangjing
 * date: 2019年2月26日 下午3:58:06
 */
@FeignClient("uni-platform")
public interface LineClientService extends LineService{

}
