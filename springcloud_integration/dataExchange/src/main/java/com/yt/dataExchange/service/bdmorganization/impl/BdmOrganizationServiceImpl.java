package com.yt.dataExchange.service.bdmorganization.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yt.coreapi.dto.BdmOrganizationDTO;
import com.yt.coreapi.utils.BaseConvert;
import com.yt.coreapi.utils.ReturnData;
import com.yt.dataExchange.service.AbstractServiceImpl;
import com.yt.dataExchange.service.bdmorganization.BdmOrganizationClientService;
import com.yt.dataExchange.service.bdmorganization.BdmOrganizationService;
import com.yt.dataExchange.web.model.BdmOrganization;
import com.yt.dataExchange.web.vo.BdmOrganizationVO;

/**
 * 
 * 
 * @author zhangjing 
 * date: 2019年3月13日 下午4:38:00
 */
@Service
public class BdmOrganizationServiceImpl extends AbstractServiceImpl implements BdmOrganizationService {

	@Autowired
	private BdmOrganizationClientService bdmOrganizationClientService;

	@HystrixCommand(fallbackMethod = "queryBdmOrganizationListByConditionFallback")
	@Override
	public ReturnData queryBdmOrganizationListByCondition(BdmOrganization bdmOrganization) {
		BdmOrganizationDTO bdmOrganizationDTO = BaseConvert.convert(bdmOrganization, BdmOrganizationDTO.class);
		PageInfo<BdmOrganizationDTO> pageInfo = bdmOrganizationClientService
				.queryBdmOrganizationListByCondition(bdmOrganizationDTO);
		return returnList(pageInfo, BdmOrganizationVO.class);
	}

	@HystrixCommand(fallbackMethod = "queryBdmOrganizationByIdFallback")
	@Override
	public ReturnData queryBdmOrganizationById(String id) {
		BdmOrganizationDTO bdmOrganizationDTO = bdmOrganizationClientService.queryBdmOrganizationById(id);
		return returnDate(bdmOrganizationDTO, BdmOrganizationVO.class);
	}
	
	/***********************************降级服务*******************************************/
	public ReturnData queryBdmOrganizationByIdFallback(String id,Throwable e) {
		return invokeCallback(new String("id:"+id),e,"queryBdmOrganizationById");
	}
	
	public ReturnData queryBdmOrganizationListByConditionFallback(BdmOrganization bdmOrganization,Throwable e) {
		return invokeCallback(bdmOrganization,e,"queryBdmOrganizationListByCondition");
	}
	
}
