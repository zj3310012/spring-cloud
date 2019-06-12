package com.zj.dataExchange.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zj.dataExchange.service.transportprotocol.TransportProtocolService;
import com.zj.dataExchange.utils.ReturnData;
import com.zj.dataExchange.web.model.TransportProtocol;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/transportPro")
@Api(tags="运单操作")
public class TransportProtocolController {

	@Autowired
	private TransportProtocolService transportProtocolService;
	
	@ApiOperation(value = "查询运单信息", notes = "根据条件获取运单列表")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public ReturnData getTransportProtocolByCondition(@RequestBody TransportProtocol transportProtocol) {
		return transportProtocolService.queryTransportProtocolListByCondition(transportProtocol);
	}
	
	@ApiImplicitParam(name = "transNumber",value = "运单号",paramType = "query",dataType = "string")
	@ApiOperation(value = "查询运单详情" , notes="根据运单号查询运单详情")
	@RequestMapping(value = "/detail/transNumber", method = RequestMethod.GET)
	@ResponseBody
	public ReturnData getTransportProtocolByTransNumber(@RequestParam("transNumber") String transNumber) {
		return transportProtocolService.queryTransportProtocolByTransNumber(transNumber);
	}
	
	@ApiImplicitParam(name = "id",value = "运单id",paramType = "query",dataType = "string")
	@ApiOperation(value = "查询运单详情" , notes="根据id查询运单详情")
	@RequestMapping(value = "/detail/id", method = RequestMethod.GET)
	@ResponseBody
	public ReturnData getTransportProtocolById(@RequestParam("id") String id) {
		return transportProtocolService.queryTransportProtocolById(id);
	}
}
