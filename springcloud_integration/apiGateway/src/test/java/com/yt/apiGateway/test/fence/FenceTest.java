package com.yt.apiGateway.test.fence;

import com.alibaba.fastjson.JSONObject;
import com.yt.apiGateway.test.AbstractCommon;

public class FenceTest extends AbstractCommon{

	public static void testGetFenceListByCondition() throws Exception{
		String uri = "/fence/list";
		JSONObject paramJson = new JSONObject();
		paramJson.put("fkLocationCode", "000001");
		paramJson.put("currentPage", "1");
		paramJson.put("size", "10");
		String result = testGetListByCondition(uri,paramJson);
		System.out.println(result);
	}
	
	public static void main(String[] args) throws Exception {
		testGetFenceListByCondition();
	}
}
