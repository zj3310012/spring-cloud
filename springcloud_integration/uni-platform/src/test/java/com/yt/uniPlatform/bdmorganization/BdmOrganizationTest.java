package com.yt.uniPlatform.bdmorganization;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.yt.uniPlatform.UniPlatformApplicationTests;
import com.yt.uniPlatform.service.bdmorganization.BdmOrganizationService;
import com.yt.uniPlatform.service.bdmorganization.dto.BdmOrganizationDTO;

public class BdmOrganizationTest extends UniPlatformApplicationTests{

	@Autowired
	private BdmOrganizationService bdmOrganizationService;
	
	@Test
	public void testGetBdmOrganizationById() {
		BdmOrganizationDTO bdmOrganization = bdmOrganizationService.queryBdmOrganizationById("1");
		System.out.println(JSONObject.toJSONString(bdmOrganization));
	}
	
	@Test
	public void testGetBdmOrganizationByCondition() {
		BdmOrganizationDTO bdmOrganization = new BdmOrganizationDTO();
		bdmOrganization.setCurrentPage(1);
		bdmOrganization.setSize(10);
		bdmOrganization.setName("温州市");
		PageInfo<BdmOrganizationDTO> list = bdmOrganizationService.queryBdmOrganizationListByCondition(bdmOrganization);
		System.out.println(JSONArray.toJSONString(list));
	}
}
