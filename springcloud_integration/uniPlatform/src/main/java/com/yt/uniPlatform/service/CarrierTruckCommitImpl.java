package com.yt.uniPlatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yt.coreapi.dto.CarrierTruckCommitDTO;
import com.yt.coreapi.serivce.CarrierTruckCommitService;
import com.yt.uniPlatform.mapper.CarrierTruckCommitMapper;

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
