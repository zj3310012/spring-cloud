package com.yt.apiGateway.test.truck;

import com.alibaba.fastjson.JSONObject;
import com.yt.apiGateway.test.AbstractCommon;

public class TruckTest extends AbstractCommon{

	public static void testGetTruckById() throws Exception {
		String uri = "/truck/detail";
		String id = "2538";
		JSONObject paramJson = new JSONObject();
		paramJson.put("id", id);
		String result = testGetObjectByDetail(uri,paramJson);
		System.out.println(result);
	}
	
	public static void testGetTruckListByCondition() throws Exception {
		String uri = "/truck/list";
		JSONObject paramJson = new JSONObject();
		paramJson.put("runMode", "1");
		paramJson.put("currentPage", "1");
		paramJson.put("size", "10");
		String result = testGetListByCondition(uri,paramJson);
		System.out.println(result);
	}
	
	public static void main(String[] args) throws Exception {
		//testGetTruckById();
		testGetTruckListByCondition();
	}
}
