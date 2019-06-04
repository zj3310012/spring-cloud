package com.yt.apiGateway.test.user;

import com.alibaba.fastjson.JSONObject;
import com.yt.apiGateway.test.AbstractCommon;

public class UserTest extends AbstractCommon{

	public static void testGetUserByUsername() throws Exception {
		String uri = "/user/detail/username";
		String username = "99999999";
		JSONObject paramJson = new JSONObject();
		paramJson.put("username", username);
		String result = testGetObjectByDetail(uri,paramJson);
		System.out.println(result);
	}
	
	public static void testGetUserListByCondition() throws Exception {
		String uri = "/user/list";
		JSONObject paramJson = new JSONObject();
		paramJson.put("roleType", "0");
		paramJson.put("currentPage", "1");
		paramJson.put("size", "10");
		String result = testGetListByCondition(uri,paramJson);
		System.out.println(result);
	}
	
	public static void main(String[] args) throws Exception {
		//testGetUserByUsername();
		testGetUserListByCondition();
	}
}
