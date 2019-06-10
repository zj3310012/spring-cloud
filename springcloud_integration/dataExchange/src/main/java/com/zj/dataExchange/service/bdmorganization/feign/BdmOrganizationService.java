package com.zj.dataExchange.service.bdmorganization.feign;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.zj.dataExchange.service.bdmorganization.dto.BdmOrganizationDTO;

/**
 * 
 * @author zhangjing
 * date: 2019年2月26日 下午6:32:25
 */
@RequestMapping("/bdmorganization")
public interface BdmOrganizationService {

	/**
	 * 根据条件查询组织
	 * 
	 * @param bdmOrganizationDTO
	 * @return
	 */
	@RequestMapping(value="/querybdmorganizationlistbycondition", method = RequestMethod.POST)
	public PageInfo<BdmOrganizationDTO> queryBdmOrganizationListByCondition(@RequestBody BdmOrganizationDTO bdmOrganizationDTO); 
	
	/**
	 * 根据id查询组织详情
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/querybdmorganizationbyid", method = RequestMethod.GET)
	public BdmOrganizationDTO queryBdmOrganizationById(@RequestParam("id") String id);
}
