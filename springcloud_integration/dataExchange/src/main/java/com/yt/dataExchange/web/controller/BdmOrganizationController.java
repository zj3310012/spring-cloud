package com.yt.dataExchange.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yt.coreapi.utils.ReturnData;
import com.yt.dataExchange.service.bdmorganization.BdmOrganizationService;
import com.yt.dataExchange.web.model.BdmOrganization;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/bdmOrg")
@Api(tags="组织操作")
public class BdmOrganizationController {

	@Autowired
	private BdmOrganizationService bdmOrganizationService;

	@ApiOperation(value = "查询组织信息", notes = "根据条件查询组织列表")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public ReturnData getBdmOrganizationByCondition(@RequestBody BdmOrganization bdmOrganization) {
		/*
		 * bdmOrganizationVO.setName("温州市");
		 */
		return bdmOrganizationService.queryBdmOrganizationListByCondition(bdmOrganization);
	}

	@ApiOperation(value = "查询组织详情", notes = "根据id查询组织详情")
	@ApiImplicitParam(name = "id", value = "组织id", paramType = "query", dataType = "string")
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	@ResponseBody
	public ReturnData getBdmOrganizationById(@RequestParam("id") String id) {
		return bdmOrganizationService.queryBdmOrganizationById(id);
	}

}
