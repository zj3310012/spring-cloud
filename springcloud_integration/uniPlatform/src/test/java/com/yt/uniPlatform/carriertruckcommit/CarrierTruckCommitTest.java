package com.yt.uniPlatform.carriertruckcommit;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.yt.coreapi.dto.CarrierTruckCommitDTO;
import com.yt.coreapi.serivce.CarrierTruckCommitService;
import com.yt.uniPlatform.UniPlatformApplicationTests;

public class CarrierTruckCommitTest extends UniPlatformApplicationTests {

	@Autowired
	private CarrierTruckCommitService carrierTruckCommitService;

	@Test
	public void testGetCarrierTruckCommitByFkTruckPlate() {
		CarrierTruckCommitDTO carrierTruckCommit = carrierTruckCommitService.queryCarrierTruckCommitByFkTruckPlate("豫A11111");
		System.out.println(JSONObject.toJSONString(carrierTruckCommit));
	}

}
