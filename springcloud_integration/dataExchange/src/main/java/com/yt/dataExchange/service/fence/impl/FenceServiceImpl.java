package com.yt.dataExchange.service.fence.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yt.coreapi.dto.FenceDTO;
import com.yt.coreapi.utils.BaseConvert;
import com.yt.coreapi.utils.ReturnData;
import com.yt.dataExchange.service.AbstractServiceImpl;
import com.yt.dataExchange.service.fence.FenceClientService;
import com.yt.dataExchange.service.fence.FenceService;
import com.yt.dataExchange.web.model.Fence;
import com.yt.dataExchange.web.vo.FenceVO;

/**
 * 
 * @author Administrator
 * date: 2019年3月18日 上午10:40:18
 */
@Service
public class FenceServiceImpl extends AbstractServiceImpl implements FenceService{

	@Autowired
	private FenceClientService fenceClientService;
	
	@HystrixCommand(fallbackMethod = "queryFenceListByConditionFallback")
	@Override
	public ReturnData queryFenceListByCondition(Fence fence) {
		FenceDTO fenceDTO = BaseConvert.convert(fence, FenceDTO.class);
		PageInfo<FenceDTO> pageInfo = fenceClientService.queryFenceListByCondition(fenceDTO);
		return returnList(pageInfo, FenceVO.class);
	}

	/***********************************降级服务*******************************************/
	public ReturnData queryFenceListByConditionFallback(Fence fence,Throwable e) {
		return invokeCallback(fence,e,"queryFenceListByCondition");
	}
}
