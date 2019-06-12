package com.zj.dataExchange.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zj.dataExchange.service.jgCarrier.JgCarrierService;
import com.zj.dataExchange.utils.ReturnData;
import com.zj.dataExchange.web.model.JgCarrier;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/jgCarrier")
@Api(tags="金刚承运商操作")
public class JgCarrierController {

	@Autowired
	private JgCarrierService jgCarrierService;

	@ApiOperation(value = "查询金刚承运商", notes = "根据条件查询金刚承运商列表")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public ReturnData getJgCarrierByCondition(@RequestBody JgCarrier jgCarrier) {
		/*
		 * jgCarrierVO.setName("承运商");
		 */
		return jgCarrierService.queryJgCarrierListByCondition(jgCarrier);
	}
}
