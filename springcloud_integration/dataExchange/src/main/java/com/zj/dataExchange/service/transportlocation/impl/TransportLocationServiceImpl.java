package com.zj.dataExchange.service.transportlocation.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zj.dataExchange.service.AbstractServiceImpl;
import com.zj.dataExchange.service.transportlocation.TransportLocationService;
import com.zj.dataExchange.service.transportlocation.dto.TransportLocationDTO;
import com.zj.dataExchange.service.transportlocation.fegin.TransportLocationClientService;
import com.zj.dataExchange.utils.BaseConvert;
import com.zj.dataExchange.utils.ReturnData;
import com.zj.dataExchange.web.model.TransportLocation;
import com.zj.dataExchange.web.vo.TransportLocationVO;

/**
 * 
 * @author zhangjing
 * date: 2019年3月14日 上午10:20:40
 */
@Service
public class TransportLocationServiceImpl extends AbstractServiceImpl implements TransportLocationService{

	@Autowired
	private TransportLocationClientService transportLocationClientService;
	
	@HystrixCommand(fallbackMethod = "queryTransportLocationListByConditionFallback")
	@Override
	public ReturnData queryTransportLocationListByCondition(TransportLocation transportLocation) {
		TransportLocationDTO transportLocationDTO = BaseConvert.convert(transportLocation, TransportLocationDTO.class);
		PageInfo<TransportLocationDTO> pageInfo = transportLocationClientService.queryTransportLocationListByCondition(transportLocationDTO);
		return returnList(pageInfo, TransportLocationVO.class);
	}

	@HystrixCommand(fallbackMethod = "queryTransportLocationByIdFallback")
	@Override
	public ReturnData queryTransportLocationById(String id) {
		TransportLocationDTO transportLocationDTO = transportLocationClientService.queryTransportLocationById(id);
		return returnDate(transportLocationDTO, TransportLocationVO.class);
	}

	/***********************************降级服务*******************************************/
	public ReturnData queryTransportLocationListByConditionFallback(TransportLocation transportLocation,Throwable e) {
		return invokeCallback(transportLocation,e,"queryTransportLocationListByCondition");
	}
	
	public ReturnData queryTransportLocationByIdFallback(String id,Throwable e) {
		return invokeCallback(new String("id:"+id),e,"queryTransportLocationById");
	}
}
