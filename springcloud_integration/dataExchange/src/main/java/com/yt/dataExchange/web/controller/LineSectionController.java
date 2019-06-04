package com.yt.dataExchange.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yt.coreapi.utils.ReturnData;
import com.yt.dataExchange.service.linesection.LineSectionSerivce;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/lineSection")
@Api(tags="路段操作")
public class LineSectionController {

	@Autowired
	private LineSectionSerivce  lineSectionSerivce;
	
	@ApiImplicitParam(name = "id",value = "路段id",paramType = "query",dataType = "string")
	@ApiOperation(value = "根据id查询路段" , notes="根据id查询路段详情")
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	@ResponseBody
	public ReturnData getLineSectionById(@RequestParam("id") String id) {
		return lineSectionSerivce.queryLineSectionById(id);
	}
}
