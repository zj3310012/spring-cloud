package com.zj.dataExchange.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zj.dataExchange.service.carriertruckcommit.CarrierTruckCommitService;
import com.zj.dataExchange.utils.ReturnData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/carrierTruckCommit")
@Api(tags="车辆审核记录操作")
public class CarrierTruckCommitController {

	@Autowired
	private CarrierTruckCommitService carrierTruckCommitService;

	@ApiOperation(value = "查询车辆审核记录", notes = "根据车牌号获取车辆审核记录")
	@ApiImplicitParam(name = "fkTruckPlate", value = "车牌号", paramType = "query", dataType = "string")
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	@ResponseBody
	public ReturnData getCarrierTruckCommitByFkTruckPlate(@RequestParam("fkTruckPlate") String fkTruckPlate) {
		
		return carrierTruckCommitService.queryCarrierTruckCommitByFkTruckPlate(fkTruckPlate);
	}

}
