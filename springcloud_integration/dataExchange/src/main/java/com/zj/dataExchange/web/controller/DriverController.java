package com.zj.dataExchange.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yt.coreapi.utils.ReturnData;
import com.zj.dataExchange.service.driver.DriverService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/driver")
@Api(tags="司机操作")
public class DriverController {

	@Autowired
	private DriverService driverService;
	
	@ApiImplicitParam(name = "id",value = "司机id",paramType = "query",dataType = "string")
	@ApiOperation(value = "获取司机详情" , notes="根据id获取司机详情")
	@RequestMapping(value = "/detail/id", method = RequestMethod.GET)
	@ResponseBody
	public ReturnData getDriverById(@RequestParam("id")String id) {
		return driverService.queryDriverById(id);
	}
	
	@ApiImplicitParam(name = "fkUserId",value = "用户id",paramType = "query",dataType = "string")
	@ApiOperation(value = "根据用户id获取司机" , notes="根据用户id获取司机")
	@RequestMapping(value = "/detail/userId", method = RequestMethod.GET)
	@ResponseBody
	public ReturnData getDriverByFkUserId(@RequestParam("fkUserId")String fkUserId) {
		return driverService.queryDriverByFkUserId(fkUserId);
	}
}
