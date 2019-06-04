package com.yt.dataExchange.service.jgCarrier;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.yt.coreapi.serivce.JgCarrierService;

@FeignClient("uniPlatform")
public interface JgCarrierClientService extends JgCarrierService{

}
