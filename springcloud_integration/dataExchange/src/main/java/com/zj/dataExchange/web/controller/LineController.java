package com.zj.dataExchange.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yt.coreapi.utils.ReturnData;
import com.zj.dataExchange.service.line.LineService;
import com.zj.dataExchange.web.model.Line;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/line")
@Api(tags="线路操作")
public class LineController {

	@Autowired
	private LineService lineService;

	@ApiOperation(value = "查询线路", notes = "根据条件查询线路列表")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public ReturnData getLineByCondition(@RequestBody Line line) {
		/*
		 * lineVO.setLineName("东华中心");
		 */
		return lineService.queryLineListByCondition(line);
	}

	@ApiImplicitParam(name = "id",value = "线路id",paramType = "query",dataType = "string")
	@ApiOperation(value = "根据id查询线路" , notes="根据id查询线路详情")
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	@ResponseBody
	public ReturnData getLineById(@RequestParam("id") String id) {
		return lineService.queryLineById(id);
	}
}
