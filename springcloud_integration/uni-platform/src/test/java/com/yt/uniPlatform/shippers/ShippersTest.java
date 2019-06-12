package com.yt.uniPlatform.shippers;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.yt.uniPlatform.UniPlatformApplicationTests;
import com.yt.uniPlatform.service.shippers.ShippersService;
import com.yt.uniPlatform.service.shippers.dto.ShippersDTO;

public class ShippersTest extends UniPlatformApplicationTests{

	@Autowired
	private ShippersService shippersService;
	
	@Test
	public void testGetLShippersById() {
		ShippersDTO shippers = shippersService.queryShippersById("38");
		System.out.println(JSONObject.toJSONString(shippers));
	}
}
