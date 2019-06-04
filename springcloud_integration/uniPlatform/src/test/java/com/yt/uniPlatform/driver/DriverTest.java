package com.yt.uniPlatform.driver;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.yt.coreapi.dto.DriverDTO;
import com.yt.coreapi.serivce.DriverService;
import com.yt.uniPlatform.UniPlatformApplicationTests;

public class DriverTest extends UniPlatformApplicationTests{

	@Autowired
	private DriverService driverService;
	
	@Test
	public void testGetDriverById() {
		DriverDTO driver = driverService.queryDriverById("1");
		System.out.println(JSONObject.toJSONString(driver));
	}
	
	@Test
	public void testGetDriverByFkUserId() {
		DriverDTO driver = driverService.queryDriverByFkUserId("340");
		System.out.println(JSONObject.toJSONString(driver));
	}
}
