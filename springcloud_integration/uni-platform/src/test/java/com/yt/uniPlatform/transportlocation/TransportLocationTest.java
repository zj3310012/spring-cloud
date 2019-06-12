package com.yt.uniPlatform.transportlocation;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.yt.uniPlatform.UniPlatformApplicationTests;
import com.yt.uniPlatform.service.transportlocation.TransportLocationService;
import com.yt.uniPlatform.service.transportlocation.dto.TransportLocationDTO;

public class TransportLocationTest extends UniPlatformApplicationTests{

	@Autowired
	private TransportLocationService transportLocationService;
	
	@Test
	public void testGetTransportLocationById() {
		TransportLocationDTO transportLocation = transportLocationService.queryTransportLocationById("84");
		System.out.println(JSONObject.toJSONString(transportLocation));
	}
	
	@Test
	public void testGetTransportLocationByCondition() {
		TransportLocationDTO transportLocation = new TransportLocationDTO();
		transportLocation.setCurrentPage(1);
		transportLocation.setSize(10);
		transportLocation.setName("杭州");
		PageInfo<TransportLocationDTO> list = transportLocationService.queryTransportLocationListByCondition(transportLocation);
		System.out.println(JSONArray.toJSONString(list));
	}
}
