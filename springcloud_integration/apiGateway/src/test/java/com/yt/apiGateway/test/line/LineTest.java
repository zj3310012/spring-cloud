package com.yt.apiGateway.test.line;

import com.alibaba.fastjson.JSONObject;
import com.yt.apiGateway.test.AbstractCommon;

public class LineTest extends AbstractCommon{

	public static void testGetLineById() throws Exception {
		String uri = "/line/detail";
		String id = "1";
		JSONObject paramJson = new JSONObject();
		paramJson.put("id", id);
		String result = testGetObjectByDetail(uri,paramJson);
		System.out.println(result);
	}
	
	public static void testGetLineListByCondition() throws Exception {
		String uri = "/line/list";
		JSONObject paramJson = new JSONObject();
		paramJson.put("lineName", "东华中心");
		paramJson.put("currentPage", "1");
		paramJson.put("size", "10");
		String result = testGetListByCondition(uri,paramJson);
		System.out.println(result);
	}
	
	
	public static void main(String[] args) throws Exception {
		//testGetLineById();
		testGetLineListByCondition();
	}
}
