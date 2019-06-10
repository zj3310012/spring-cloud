package com.zj.dataExchange.service.truck.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zj.dataExchange.service.AbstractServiceImpl;
import com.zj.dataExchange.service.truck.TruckService;
import com.zj.dataExchange.service.truck.dto.TruckDTO;
import com.zj.dataExchange.service.truck.feign.TruckClientService;
import com.zj.dataExchange.utils.BaseConvert;
import com.zj.dataExchange.utils.ReturnData;
import com.zj.dataExchange.web.model.Truck;
import com.zj.dataExchange.web.vo.TruckVO;

/**
 * 
 * @author zhangjing
 * date: 2019年3月14日 上午11:37:19
 */
@Service
public class TruckServiceImpl extends AbstractServiceImpl implements TruckService{

	@Autowired
	private TruckClientService truckClientService;
	
	@HystrixCommand(fallbackMethod = "queryTruckListByConditionFallback")
	@Override
	public ReturnData queryTruckListByCondition(Truck truck) {
		TruckDTO truckDTO = BaseConvert.convert(truck, TruckDTO.class);
		PageInfo<TruckDTO> pageInfo = truckClientService.queryTruckListByCondition(truckDTO);
		return returnList(pageInfo, TruckVO.class);
	}

	@HystrixCommand(fallbackMethod = "queryTruckByIdFallback")
	@Override
	public ReturnData queryTruckById(String id) {
		TruckDTO truckDTO = truckClientService.queryTruckById(id);
		return returnDate(truckDTO, TruckVO.class);
	}
	
	/***********************************降级服务*******************************************/
	public ReturnData queryTruckListByConditionFallback(Truck truck,Throwable e) {
		return invokeCallback(truck,e,"queryTruckListByCondition");
	}
	
	public ReturnData queryTruckByIdFallback(String id,Throwable e) {
		return invokeCallback(new String("id:"+id),e,"queryTruckById");
	}

}
