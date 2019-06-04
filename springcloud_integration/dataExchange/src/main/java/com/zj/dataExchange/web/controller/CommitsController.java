package com.zj.dataExchange.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yt.coreapi.utils.ReturnData;
import com.zj.dataExchange.service.commits.CommitsService;
import com.zj.dataExchange.web.model.Commits;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/commits")
@Api(tags="承运商资质审核结果操作")
public class CommitsController {

	@Autowired
	private CommitsService commitsService;

	@ApiOperation(value = "查询承运商资质审核结果", notes = "根据id查询承运商资质审核结果详情")
	@ApiImplicitParam(name = "id", value = "承运商资质审核结果id", paramType = "query", dataType = "string")
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	@ResponseBody
	public ReturnData getCommitsById(@RequestParam("id") String id) {
		
		return commitsService.queryCommitsById(id);
	}

	@ApiOperation(value = "查询承运商资质审核结果列表", notes = "根据条件查询承运商资质审核结果列表")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public ReturnData getCommitsListByCondition(@RequestBody Commits commits) {

		return commitsService.queryCommitsListByCondition(commits);
	}

}
