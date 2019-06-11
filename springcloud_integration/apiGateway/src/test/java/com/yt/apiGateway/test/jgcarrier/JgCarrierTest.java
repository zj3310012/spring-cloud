package com.yt.apiGateway.test.jgcarrier;

import com.alibaba.fastjson.JSONObject;
import com.yt.apiGateway.test.AbstractCommon;

public class JgCarrierTest extends AbstractCommon{

	public static void testGetJgCarrierListByCondition() throws Exception {
		String uri = "/jgCarrier/list";
		JSONObject paramJson = new JSONObject();
		paramJson.put("name", "承运商");
		paramJson.put("currentPage", "1");
		paramJson.put("size", "10");
		String result = testGetListByCondition(uri,paramJson);
		System.out.println(result);
	}
	
	public static void main(String[] args) throws Exception {
		testGetJgCarrierListByCondition();
	}
}
