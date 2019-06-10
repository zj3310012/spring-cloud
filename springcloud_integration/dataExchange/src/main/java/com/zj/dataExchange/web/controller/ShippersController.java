package com.zj.dataExchange.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zj.dataExchange.service.shippers.ShippersService;
import com.zj.dataExchange.utils.ReturnData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/shippers")
@Api(tags="承运商资质操作")
public class ShippersController {

	@Autowired
	private ShippersService shippersService;
	
	@ApiImplicitParam(name = "id",value = "承运商资质id",paramType = "query",dataType = "string")
	@ApiOperation(value = "根据id查询承运商资质" , notes="根据id查询承运商资质详情")
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	@ResponseBody
	public ReturnData getShippersById(@RequestParam("id") String id) {
		return shippersService.queryShippersById(id);
	}
}
