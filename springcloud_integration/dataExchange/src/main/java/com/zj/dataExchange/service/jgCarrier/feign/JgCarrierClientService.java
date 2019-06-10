package com.zj.dataExchange.service.jgCarrier.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("uniPlatform")
public interface JgCarrierClientService extends JgCarrierService{

}
