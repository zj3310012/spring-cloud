package com.yt.uniPlatform.service.carriertruckcommit.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yt.uniPlatform.mapper.CarrierTruckCommitMapper;
import com.yt.uniPlatform.service.AbstractServiceImpl;
import com.yt.uniPlatform.service.carriertruckcommit.CarrierTruckCommitService;
import com.yt.uniPlatform.service.carriertruckcommit.dto.CarrierTruckCommitDTO;

/**
 * 
 * @author zhangjing 
 * date: 2019年3月4日 下午4:28:03
 */
@RestController
public class CarrierTruckCommitImpl extends AbstractServiceImpl implements CarrierTruckCommitService {

	@Autowired
	private CarrierTruckCommitMapper carrierTruckCommitMapper;

	@Override
	public CarrierTruckCommitDTO queryCarrierTruckCommitByFkTruckPlate(
			@RequestParam("fkTruckPlate") String fkTruckPlate) {
		
		return returnDTO(carrierTruckCommitMapper.queryCarrierTruckCommitByFkTruckPlate(fkTruckPlate),
				CarrierTruckCommitDTO.class);
	}

}
