package com.yt.uniPlatform.linesection;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.yt.uniPlatform.UniPlatformApplicationTests;
import com.yt.uniPlatform.service.linesection.LineSectionSerivce;
import com.yt.uniPlatform.service.linesection.dto.LineSectionDTO;

public class LineSectionTest extends UniPlatformApplicationTests{

	@Autowired
	private LineSectionSerivce lineSectionService;
	
	@Test
	public void testGetLineSectionById() {
		LineSectionDTO lineSection = lineSectionService.queryDriverById("619168");
		System.out.println(JSONObject.toJSONString(lineSection));
	}
}
