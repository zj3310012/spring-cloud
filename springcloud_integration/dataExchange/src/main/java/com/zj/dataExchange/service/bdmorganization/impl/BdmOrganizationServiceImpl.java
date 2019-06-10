package com.zj.dataExchange.service.bdmorganization.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zj.dataExchange.service.AbstractServiceImpl;
import com.zj.dataExchange.service.bdmorganization.BdmOrganizationService;
import com.zj.dataExchange.service.bdmorganization.dto.BdmOrganizationDTO;
import com.zj.dataExchange.service.bdmorganization.feign.BdmOrganizationClientService;
import com.zj.dataExchange.utils.BaseConvert;
import com.zj.dataExchange.utils.ReturnData;
import com.zj.dataExchange.web.model.BdmOrganization;
import com.zj.dataExchange.web.vo.BdmOrganizationVO;

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
