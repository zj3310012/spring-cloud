package com.yt.uniPlatform.shippers;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.yt.uniPlatform.UniPlatformApplicationTests;
import com.yt.uniPlatform.dataObject.ShippersDO;
import com.yt.uniPlatform.mapper.ShippersMapper;

public class ShippersTest extends UniPlatformApplicationTests{

	@Autowired
	private ShippersMapper shippersMapper;
	
	@Test
	public void testGetLShippersById() {
		ShippersDO shippers = shippersMapper.queryShippersById("38");
		System.out.println(JSONObject.toJSONString(shippers));
	}
}
