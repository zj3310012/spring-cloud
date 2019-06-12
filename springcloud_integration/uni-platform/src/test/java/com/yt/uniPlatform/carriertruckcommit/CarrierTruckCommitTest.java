package com.yt.uniPlatform.carriertruckcommit;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.yt.uniPlatform.UniPlatformApplicationTests;
import com.yt.uniPlatform.service.carriertruckcommit.CarrierTruckCommitService;
import com.yt.uniPlatform.service.carriertruckcommit.dto.CarrierTruckCommitDTO;

public class CarrierTruckCommitTest extends UniPlatformApplicationTests {

	@Autowired
	private CarrierTruckCommitService carrierTruckCommitService;

	@Test
	public void testGetCarrierTruckCommitByFkTruckPlate() {
		CarrierTruckCommitDTO carrierTruckCommit = carrierTruckCommitService.queryCarrierTruckCommitByFkTruckPlate("豫A11111");
		System.out.println(JSONObject.toJSONString(carrierTruckCommit));
	}

}
