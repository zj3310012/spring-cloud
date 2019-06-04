package com.zj.dataExchange.service.linesection.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yt.coreapi.dto.LineSectionDTO;
import com.yt.coreapi.utils.ReturnData;
import com.zj.dataExchange.service.AbstractServiceImpl;
import com.zj.dataExchange.service.linesection.LineSectionSerivce;
import com.zj.dataExchange.service.linesection.feign.LineSectionClinetService;
import com.zj.dataExchange.web.vo.LineSectionVO;

/**
 * 
 * 
 * @author zhangjing
 * date: 2019年3月25日 上午11:25:25
 */
@Service
public class LineSectionSerivceImpl extends AbstractServiceImpl implements LineSectionSerivce {
	
	@Autowired
	private LineSectionClinetService lineSectionClinetService;
	
	@HystrixCommand(fallbackMethod = "queryLineSectionByIdFallback")
	@Override
	public ReturnData queryLineSectionById(String id) {
		LineSectionDTO lineSectionDTO = lineSectionClinetService.queryDriverById(id);
		return returnDate(lineSectionDTO, LineSectionVO.class);
	}
	
	/***********************************降级服务*******************************************/
	public ReturnData queryLineSectionByIdFallback(String id,Throwable e) {
		return invokeCallback(new String("id:"+id),e,"queryLineSectionById");
	}
}
