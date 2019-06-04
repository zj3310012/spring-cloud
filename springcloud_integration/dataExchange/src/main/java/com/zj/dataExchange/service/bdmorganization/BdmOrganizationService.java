package com.zj.dataExchange.service.bdmorganization;

import com.yt.coreapi.utils.ReturnData;
import com.zj.dataExchange.web.model.BdmOrganization;

/**
 * 
 * @author zhangjing date: 2019年3月13日 下午4:32:58
 */
public interface BdmOrganizationService {

	/**
	 * 根据条件查询组织
	 * 
	 * @param bdmOrganizationVO
	 * @param currentPage
	 * @param size
	 * @return
	 */
	public ReturnData queryBdmOrganizationListByCondition(BdmOrganization bdmOrganization);

	/**
	 * 根据id查询组织详情
	 * 
	 * @param id
	 * @return
	 */
	public ReturnData queryBdmOrganizationById(String id);
}
