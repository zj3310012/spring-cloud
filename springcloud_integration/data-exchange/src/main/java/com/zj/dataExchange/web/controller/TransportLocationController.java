package com.zj.dataExchange.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zj.dataExchange.service.transportlocation.TransportLocationService;
import com.zj.dataExchange.utils.ReturnData;
import com.zj.dataExchange.web.model.TransportLocation;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/transportLoc")
@Api(tags="场地操作")
public class TransportLocationController {

	@Autowired
	private TransportLocationService transportLocationService;
	
	@ApiOperation(value = "查询场地信息", notes = "根据条件查询场地信息列表")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public ReturnData getTransportProtocolByCondition(@RequestBody TransportLocation transportLocation) {
		return transportLocationService.queryTransportLocationListByCondition(transportLocation);
	}
	
	@ApiImplicitParam(name = "id",value = "场地id",paramType = "query",dataType = "string")
	@ApiOperation(value = "查询场地详情" , notes="根据id查询场地详情")
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	@ResponseBody
	public ReturnData getTransportLocationById(@RequestParam("id") String id) {
		return transportLocationService.queryTransportLocationById(id);
	}
}
