package com.zj.dataExchange.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yt.coreapi.utils.ReturnData;
import com.zj.dataExchange.service.fence.FenceService;
import com.zj.dataExchange.web.model.Fence;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * 
 * @author zhangjing
 * date: 2019年3月14日 下午3:48:26
 */
@RestController
@RequestMapping("/fence")
@Api(tags="围栏操作")
public class FenceController {

	@Autowired
	private FenceService fenceService;
	
	@ApiOperation(value = "获取围栏信息", notes = "根据获取围栏信息列表")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public ReturnData getFenceListByCondition(@RequestBody Fence fence) {
		/*
		 * fence.setFkLocationCode("000001");
		 */
		return fenceService.queryFenceListByCondition(fence);
	}

}
