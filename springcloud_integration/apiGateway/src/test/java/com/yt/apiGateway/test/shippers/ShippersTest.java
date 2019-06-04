package com.yt.apiGateway.test.shippers;

import com.alibaba.fastjson.JSONObject;
import com.yt.apiGateway.test.AbstractCommon;

public class ShippersTest extends AbstractCommon{

	public static void testGetLShippersById() throws Exception {
		String uri = "/shippers/detail";
		String id = "38";
		JSONObject paramJson = new JSONObject();
		paramJson.put("id", id);
		String result = testGetObjectByDetail(uri,paramJson);
		System.out.println(result);
	}
	
	public static void main(String[] args) throws Exception {
		testGetLShippersById();
	}
}
