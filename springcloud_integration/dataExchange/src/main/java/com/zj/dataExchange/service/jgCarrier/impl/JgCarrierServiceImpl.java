package com.zj.dataExchange.service.jgCarrier.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yt.coreapi.dto.JgCarrierDTO;
import com.yt.coreapi.utils.BaseConvert;
import com.yt.coreapi.utils.ReturnData;
import com.zj.dataExchange.service.AbstractServiceImpl;
import com.zj.dataExchange.service.jgCarrier.JgCarrierService;
import com.zj.dataExchange.service.jgCarrier.feign.JgCarrierClientService;
import com.zj.dataExchange.web.model.JgCarrier;
import com.zj.dataExchange.web.vo.JgCarrierVO;

/**
 * 
 * @author zhangjing
 * date: 2019年3月13日 下午5:06:30
 */
@Service
public class JgCarrierServiceImpl extends AbstractServiceImpl implements JgCarrierService{

	@Autowired
	private JgCarrierClientService jgCarrierClientService;
	
	@HystrixCommand(fallbackMethod = "queryJgCarrierListByConditionFallback")
	@Override
	public ReturnData queryJgCarrierListByCondition(JgCarrier jgCarrier) {
		JgCarrierDTO jgCarrierDTO = BaseConvert.convert(jgCarrier, JgCarrierDTO.class);
		PageInfo<JgCarrierDTO> pageInfo = jgCarrierClientService.queryJgCarrierListByCondition(jgCarrierDTO);
		return returnList(pageInfo, JgCarrierVO.class);
	}

	/***********************************降级服务*******************************************/
	public ReturnData queryJgCarrierListByConditionFallback(JgCarrier jgCarrier,Throwable e) {
		return invokeCallback(jgCarrier,e,"queryJgCarrierListByCondition");
	}
}
