package com.yt.apiGateway.test.driver;

import com.alibaba.fastjson.JSONObject;
import com.yt.apiGateway.test.AbstractCommon;

public class DriverTest extends AbstractCommon{

	public static void testGetDriverById() throws Exception {
		String uri = "/driver/detail/id";
		String id = "1";
		JSONObject paramJson = new JSONObject();
		paramJson.put("id", id);
		String result = testGetObjectByDetail(uri,paramJson);
		System.out.println(result);
	}
	
	
	public static void testGetDriverByFkUserId() throws Exception {
		String uri = "/driver/detail/userId";
		String fkUserId = "296";
		JSONObject paramJson = new JSONObject();
		paramJson.put("fkUserId", fkUserId);
		String result = testGetObjectByDetail(uri,paramJson);
		System.out.println(result);
	}
	
	
	public static void main(String[] args) throws Exception {
		//testGetDriverById();
		testGetDriverByFkUserId();
	}
}
