package com.zj.dataExchange.service.bdmorganization.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 
 * @author zhangjing
 * date: 2019年2月27日 下午5:06:37
 */
@FeignClient("uni-platform")
public interface BdmOrganizationClientService extends BdmOrganizationService{

}
