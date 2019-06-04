package com.yt.dataExchange.service.user;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.yt.coreapi.serivce.UserService;

/**
 * 
 * @author zhangjing
 * date: 2019年2月22日 下午4:49:51
 */
@FeignClient("uniPlatform")
public interface UserClientService extends UserService{

}
