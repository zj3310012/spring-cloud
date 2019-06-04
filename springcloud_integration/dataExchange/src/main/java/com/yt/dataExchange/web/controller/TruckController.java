package com.yt.dataExchange.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yt.coreapi.utils.ReturnData;
import com.yt.dataExchange.service.truck.TruckService;
import com.yt.dataExchange.web.model.Truck;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/truck")
@Api(tags="车辆操作")
public class TruckController {

	@Autowired
	private TruckService truckService;
	
	@ApiOperation(value = "查询车辆信息", notes = "根据条件获取车辆列表")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public ReturnData getTruckByCondition(@RequestBody Truck truck){
		/* truckVO.setCarrierName("承运商"); */
		return truckService.queryTruckListByCondition(truck);
	}
	
	@ApiImplicitParam(name = "id",value = "车辆id",paramType = "query",dataType = "string")
	@ApiOperation(value = "查询车辆详情" , notes="根据id获取车辆详情")
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	@ResponseBody
	public ReturnData getTruckById(@RequestParam("id") String id) {
		return truckService.queryTruckById(id);
	}
}
