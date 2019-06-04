package com.yt.dataExchange.service.transportprotocol.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yt.coreapi.dto.TransportProtocolDTO;
import com.yt.coreapi.utils.BaseConvert;
import com.yt.coreapi.utils.ReturnData;
import com.yt.dataExchange.service.AbstractServiceImpl;
import com.yt.dataExchange.service.transportprotocol.TransportProtocolClientService;
import com.yt.dataExchange.service.transportprotocol.TransportProtocolService;
import com.yt.dataExchange.web.model.TransportProtocol;
import com.yt.dataExchange.web.vo.TransportProtocolVO;

/**
 * 
 * @author zhangjing 
 * date: 2019年3月14日 上午10:54:47
 */
@Service
public class TransportProtocolServiceImpl extends AbstractServiceImpl implements TransportProtocolService {

	@Autowired
	private TransportProtocolClientService transportProtocolClientService;

	@HystrixCommand(fallbackMethod = "queryTransportProtocolListByConditionFallback")
	@Override
	public ReturnData queryTransportProtocolListByCondition(TransportProtocol transportProtocol) {
		TransportProtocolDTO transportProtocolDTO = BaseConvert.convert(transportProtocol, TransportProtocolDTO.class);
		PageInfo<TransportProtocolDTO> pageInfo = transportProtocolClientService
				.queryTransportProtocolListByCondition(transportProtocolDTO);
		;
		return returnList(pageInfo, TransportProtocolVO.class);
	}

	@HystrixCommand(fallbackMethod = "queryTransportProtocolByTransNumberFallback")
	@Override
	public ReturnData queryTransportProtocolByTransNumber(String transNumber) {
		TransportProtocolDTO transportProtocolDTO = transportProtocolClientService
				.queryTransportProtocolByTransNumber(transNumber);
		return returnDate(transportProtocolDTO, TransportProtocolVO.class);
	}

	@HystrixCommand(fallbackMethod = "queryTransportProtocolByIdFallback")
	@Override
	public ReturnData queryTransportProtocolById(String id) {
		TransportProtocolDTO transportProtocolDTO = transportProtocolClientService.queryTransportProtocolById(id);
		return returnDate(transportProtocolDTO, TransportProtocolVO.class);
	}
	
	/***********************************降级服务*******************************************/
	public ReturnData queryTransportProtocolListByConditionFallback(TransportProtocol transportProtocol,Throwable e) {
		return invokeCallback(transportProtocol,e,"queryTransportProtocolListByCondition");
	}
	
	public ReturnData queryTransportProtocolByTransNumberFallback(String transNumber,Throwable e) {
		return invokeCallback(new String("transNumber:"+transNumber),e,"queryTransportProtocolByTransNumber");
	}
	
	public ReturnData queryTransportProtocolByIdFallback(String id,Throwable e) {
		return invokeCallback(new String("id:"+id),e,"queryTransportProtocolById");
	}

}
