package com.yt.dataExchange.service.shippers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yt.coreapi.dto.ShippersDTO;
import com.yt.coreapi.utils.ReturnData;
import com.yt.dataExchange.service.AbstractServiceImpl;
import com.yt.dataExchange.service.shippers.ShippersClientService;
import com.yt.dataExchange.service.shippers.ShippersService;
import com.yt.dataExchange.web.vo.ShippersVO;

/**
 * 
 * 
 * @author zhangjing
 * date: 2019年3月14日 上午10:07:04
 */
@Service
public class ShippersServiceImpl extends AbstractServiceImpl implements ShippersService{

	@Autowired
	private ShippersClientService shippersClientService;
	
	@HystrixCommand(fallbackMethod = "queryShippersByIdFallback")
	@Override
	public ReturnData queryShippersById(String id) {
		ShippersDTO shippersDTO = shippersClientService.queryShippersById(id);
		return returnDate(shippersDTO, ShippersVO.class);
	}

	/***********************************降级服务*******************************************/
	public ReturnData queryShippersByIdFallback(String id,Throwable e) {
		return invokeCallback(new String("id:"+id),e,"queryShippersById");
	}
}
