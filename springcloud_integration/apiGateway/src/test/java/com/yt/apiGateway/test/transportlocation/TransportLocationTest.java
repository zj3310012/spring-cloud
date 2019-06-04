package com.yt.apiGateway.test.transportlocation;

import com.alibaba.fastjson.JSONObject;
import com.yt.apiGateway.test.AbstractCommon;

public class TransportLocationTest extends AbstractCommon{

	public static void testGetTransportLocationById() throws Exception {
		String uri = "/transportLoc/detail";
		String id = "84";
		JSONObject paramJson = new JSONObject();
		paramJson.put("id", id);
		String result = testGetObjectByDetail(uri,paramJson);
		System.out.println(result);
	}
	
	public static void testGetTransportLocationByCondition() throws Exception {
		String uri = "/transportLoc/list";
		JSONObject paramJson = new JSONObject();
		paramJson.put("status", "1");
		paramJson.put("currentPage", "1");
		paramJson.put("size", "10");
		String result = testGetListByCondition(uri,paramJson);
		System.out.println(result);
	}
	
	public static void main(String[] args) throws Exception {
		//testGetTransportLocationById();
		testGetTransportLocationByCondition();
	}
}
