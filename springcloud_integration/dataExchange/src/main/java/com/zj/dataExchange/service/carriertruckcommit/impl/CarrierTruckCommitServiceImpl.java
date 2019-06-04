package com.zj.dataExchange.service.carriertruckcommit.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yt.coreapi.dto.CarrierTruckCommitDTO;
import com.yt.coreapi.utils.ReturnData;
import com.zj.dataExchange.service.AbstractServiceImpl;
import com.zj.dataExchange.service.carriertruckcommit.CarrierTruckCommitService;
import com.zj.dataExchange.service.carriertruckcommit.feign.CarrierTruckCommitClientService;
import com.zj.dataExchange.web.vo.CarrierTruckCommitVO;

/**
 * 
 * @author zhangjing 
 * date: 2019年3月13日 下午4:42:30
 */

@Service
public class CarrierTruckCommitServiceImpl extends AbstractServiceImpl implements CarrierTruckCommitService {

	@Autowired
	private CarrierTruckCommitClientService carrierTruckCommitClientService;

	@HystrixCommand(fallbackMethod = "queryCarrierTruckCommitByFkTruckPlateFallback")
	@Override
	public ReturnData queryCarrierTruckCommitByFkTruckPlate(String fkTruckPlate) {
		CarrierTruckCommitDTO carrierTruckCommitDTO = carrierTruckCommitClientService
				.queryCarrierTruckCommitByFkTruckPlate(fkTruckPlate);
		return returnDate(carrierTruckCommitDTO, CarrierTruckCommitVO.class);
	}
	
	/***********************************降级服务*******************************************/
	public ReturnData queryCarrierTruckCommitByFkTruckPlateFallback(String fkTruckPlate, Throwable e) {
		return invokeCallback(new String("fkTruckPlate:" + fkTruckPlate), e, "queryCarrierTruckCommitByFkTruckPlate");
	}
}
