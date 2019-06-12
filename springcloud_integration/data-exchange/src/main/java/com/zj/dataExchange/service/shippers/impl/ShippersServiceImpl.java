package com.zj.dataExchange.service.shippers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zj.dataExchange.service.AbstractServiceImpl;
import com.zj.dataExchange.service.shippers.ShippersService;
import com.zj.dataExchange.service.shippers.dto.ShippersDTO;
import com.zj.dataExchange.service.shippers.feign.ShippersClientService;
import com.zj.dataExchange.utils.ReturnData;
import com.zj.dataExchange.web.vo.ShippersVO;

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
