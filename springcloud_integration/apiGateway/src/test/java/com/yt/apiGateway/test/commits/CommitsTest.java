package com.yt.apiGateway.test.commits;

import com.alibaba.fastjson.JSONObject;
import com.yt.apiGateway.test.AbstractCommon;

public class CommitsTest extends AbstractCommon{

	public static void testGetCommitsById() throws Exception {
		String uri = "/commits/detail";
		String id = "58";
		JSONObject paramJson = new JSONObject();
		paramJson.put("id", id);
		String result = testGetObjectByDetail(uri,paramJson);
		System.out.println(result);
	}
	
	public static void testGetCommitsListByCondition() throws Exception {
		String uri = "/commits/list";
		JSONObject paramJson = new JSONObject();
		paramJson.put("status", "1");
		paramJson.put("currentPage", "1");
		paramJson.put("size", "10");
		String result = testGetListByCondition(uri,paramJson);
		System.out.println(result);
	}
	
	public static void main(String[] args) throws Exception {
		testGetCommitsListByCondition();
		//testGetCommitsById();
	}
}
