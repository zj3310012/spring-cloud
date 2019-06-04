package com.yt.uniPlatform.truck;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.yt.coreapi.dto.TruckDTO;
import com.yt.coreapi.serivce.TruckService;
import com.yt.uniPlatform.UniPlatformApplicationTests;

public class TruckTest extends UniPlatformApplicationTests{

	@Autowired
	private TruckService truckService;
	
	@Test
	public void testGetTruckListByCondition() {
		TruckDTO truck = new TruckDTO();
		truck.setCurrentPage(1);
		truck.setSize(10);
		truck.setCarrierName("承运商");
		PageInfo<TruckDTO> list = truckService.queryTruckListByCondition(truck);
		System.out.println(JSONArray.toJSONString(list));
	}
	
	@Test
	public void testGetTruckById() {
		TruckDTO truck = truckService.queryTruckById("2538");
		System.out.println(JSONObject.toJSONString(truck));
	}
}
