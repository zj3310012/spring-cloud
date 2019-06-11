package com.yt.uniPlatform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yt.uniPlatform.dataObject.BdmOrganizationDO;

/**
 * 
 * @author zhangjing
 * date: 2019年2月27日 下午1:47:34
 */
public interface BdmOrganizationMapper {

	/**
	 * 根据条件查询组织
	 * 
	 * @param bdmOrganization
	 * @return
	 */
	public List<BdmOrganizationDO> queryBdmOrganizationListByCondition(@Param("bdmOrganization") BdmOrganizationDO bdmOrganization);
	
	/**
	 * 根据id查询组织详情
	 * 
	 * @param id
	 * @return
	 */
	public BdmOrganizationDO queryBdmOrganizationById(@Param("id") String id);
}
