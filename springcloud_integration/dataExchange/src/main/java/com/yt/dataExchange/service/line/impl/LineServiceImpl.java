package com.yt.dataExchange.service.line.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yt.coreapi.dto.LineDTO;
import com.yt.coreapi.utils.BaseConvert;
import com.yt.coreapi.utils.ReturnData;
import com.yt.dataExchange.service.AbstractServiceImpl;
import com.yt.dataExchange.service.line.LineClientService;
import com.yt.dataExchange.service.line.LineService;
import com.yt.dataExchange.web.model.Line;
import com.yt.dataExchange.web.vo.LineVO;

/**
 * 
 * @author zhangjing
 * date: 2019年3月13日 下午6:34:31
 */
@Service
public class LineServiceImpl extends AbstractServiceImpl implements LineService{

	@Autowired
	private LineClientService lineClientService;
	
	@HystrixCommand(fallbackMethod = "queryLineListByConditionFallback")
	@Override
	public ReturnData queryLineListByCondition(Line line) {
		LineDTO lineDTO = BaseConvert.convert(line, LineDTO.class);
		PageInfo<LineDTO> pageInfo = lineClientService.queryLineListByCondition(lineDTO);
		return returnList(pageInfo, LineVO.class);
	}

	@HystrixCommand(fallbackMethod = "queryLineByIdFallback")
	@Override
	public ReturnData queryLineById(String id) {
		LineDTO lineDTO = lineClientService.queryLineById(id);
		return returnDate(lineDTO, LineVO.class);
	}

	/***********************************降级服务*******************************************/
	public ReturnData queryLineListByConditionFallback(Line line,Throwable e) {
		return invokeCallback(line,e,"queryLineListByCondition");
	}
	
	public ReturnData queryLineByIdFallback(String id,Throwable e) {
		return invokeCallback(new String("id:"+id),e,"queryLineById");
	}
}
