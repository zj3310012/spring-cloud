package com.zj.dataExchange.service.driver.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yt.coreapi.dto.DriverDTO;
import com.yt.coreapi.utils.ReturnData;
import com.zj.dataExchange.service.AbstractServiceImpl;
import com.zj.dataExchange.service.driver.DriverService;
import com.zj.dataExchange.service.driver.feign.DriverClientService;
import com.zj.dataExchange.web.vo.DriverVO;

/**
 * 
 * 
 * @author zhangjing
 * date: 2019年3月15日 下午6:09:22
 */
@Service
public class DriverServiceImpl extends AbstractServiceImpl implements DriverService{

	@Autowired
	private DriverClientService driverClientService;
	
	@HystrixCommand(fallbackMethod = "queryDriverByIdFallback")
	@Override
	public ReturnData queryDriverById(String id) {
		DriverDTO driverDTO = driverClientService.queryDriverById(id);
		return returnDate(driverDTO, DriverVO.class);
	}

	@HystrixCommand(fallbackMethod = "queryDriverByFkUserIdFallback")
	@Override
	public ReturnData queryDriverByFkUserId(String fkUserId) {
		DriverDTO driverDTO = driverClientService.queryDriverByFkUserId(fkUserId);
		return returnDate(driverDTO, DriverVO.class);
	}

	/***********************************降级服务*******************************************/
	public ReturnData queryDriverByIdFallback(String id,Throwable e) {
		return invokeCallback(new String("id:"+id),e,"queryDriverById");
	}
	
	public ReturnData queryDriverByFkUserIdFallback(String fkUserId,Throwable e) {
		return invokeCallback(new String("fkUserId:"+fkUserId),e,"queryDriverByFkUserId");
	}
}
