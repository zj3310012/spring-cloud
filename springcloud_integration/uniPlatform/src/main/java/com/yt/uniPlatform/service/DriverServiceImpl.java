package com.yt.uniPlatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yt.coreapi.dto.DriverDTO;
import com.yt.coreapi.serivce.DriverService;
import com.yt.uniPlatform.mapper.DriverMapper;

/**
 * 
 * @author zhangjing
 * date: 2019年3月6日 下午3:14:14
 */
@RestController
public class DriverServiceImpl extends AbstractServiceImpl implements DriverService{

	@Autowired
	private DriverMapper driverMapper;
	
	@Override
	public DriverDTO queryDriverById(@RequestParam("id") String id) {
		
		 return returnDTO(driverMapper.queryDriverById(id),DriverDTO.class);
	}

	@Override
	public DriverDTO queryDriverByFkUserId(@RequestParam("fkUserId") String fkUserId) {
		
		return returnDTO(driverMapper.queryDriverByFkUserId(fkUserId),DriverDTO.class);
	}

}
