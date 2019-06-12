package com.zj.dataExchange.service.user.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 
 * @author zhangjing
 * date: 2019年2月22日 下午4:49:51
 */
@FeignClient("uni-platform")
public interface UserClientService extends UserService{

}
