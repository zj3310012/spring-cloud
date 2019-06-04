package com.zj.dataExchange.service.bdmorganization.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.yt.coreapi.serivce.BdmOrganizationService;

/**
 * 
 * @author zhangjing
 * date: 2019年2月27日 下午5:06:37
 */
@FeignClient("uniPlatform")
public interface BdmOrganizationClientService extends BdmOrganizationService{

}
