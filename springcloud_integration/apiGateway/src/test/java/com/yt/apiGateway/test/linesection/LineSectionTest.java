package com.yt.apiGateway.test.linesection;

import com.alibaba.fastjson.JSONObject;
import com.yt.apiGateway.test.AbstractCommon;

public class LineSectionTest extends AbstractCommon{

	public static void testGetLineSectionById() throws Exception {
		String uri = "/lineSection/detail";
		String id = "619168";
		JSONObject paramJson = new JSONObject();
		paramJson.put("id", id);
		String result = testGetObjectByDetail(uri,paramJson);
		System.out.println(result);
	}
	
	public static void main(String[] args) throws Exception {
		testGetLineSectionById();
	}
}
