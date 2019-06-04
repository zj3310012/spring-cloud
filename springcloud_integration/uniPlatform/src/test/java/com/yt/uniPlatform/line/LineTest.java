package com.yt.uniPlatform.line;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.yt.coreapi.dto.LineDTO;
import com.yt.coreapi.serivce.LineService;
import com.yt.uniPlatform.UniPlatformApplicationTests;

public class LineTest extends UniPlatformApplicationTests{

	@Autowired
	private LineService lineService;
	
	@Test
	public void testGetLineById() {
		LineDTO line = lineService.queryLineById("1");
		System.out.println(JSONObject.toJSONString(line));
	}
	
	@Test
	public void testGetLineListByCondition() {
		LineDTO line = new LineDTO();
		line.setCurrentPage(1);
		line.setSize(10);
		line.setLineName("东华中心");
		PageInfo<LineDTO> list = lineService.queryLineListByCondition(line);
		System.out.println(JSONArray.toJSONString(list));
	}
}
