package com.yt.apiGateway.test.carriertruckcommit;

import com.alibaba.fastjson.JSONObject;
import com.yt.apiGateway.test.AbstractCommon;

/**
 * 
 * @author zhangjing
 * date: 2019年4月1日 下午4:27:39
 */
public class CarrierTrunkCommitTest extends AbstractCommon{

	public static void testGetCarrierTruckCommitByFkTruckPlate() throws Exception {
		String uri = "/carrierTruckCommit/detail";
		String fkTruckPlate = "豫A11111";
		JSONObject paramJson = new JSONObject();
		paramJson.put("fkTruckPlate", fkTruckPlate);
		String result = testGetObjectByDetail(uri,paramJson);
		System.out.println(result);
	}
	
	public static void main(String[] args) throws Exception {
		testGetCarrierTruckCommitByFkTruckPlate();
	}
}
