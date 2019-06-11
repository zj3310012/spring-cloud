package com.yt.apiGateway.test.bdmorganization;

import com.alibaba.fastjson.JSONObject;
import com.yt.apiGateway.test.AbstractCommon;

/**
 * 
 * @author zhangjing
 * date: 2019年3月28日 下午1:31:21
 */
public class BdmOrganizationTest extends AbstractCommon{

	public static void testGetBdmOrganizationById() throws Exception {
		String uri = "/bdmOrg/detail";
		String id = "1";
		JSONObject paramJson = new JSONObject();
		paramJson.put("id", id);
		String result = testGetObjectByDetail(uri,paramJson);
		System.out.println(result);
	}
	
	public static void testGetBdmOrganizationByCondition() throws Exception{
		String uri = "/bdmOrg/list";
		JSONObject paramJson = new JSONObject();
		paramJson.put("name", "温州市");
		paramJson.put("currentPage", "1");
		paramJson.put("size", "10");
		String result = testGetListByCondition(uri,paramJson);
		System.out.println(result);
	}
	
	public static void main(String[] args) throws Exception {
		testGetBdmOrganizationById();
		//testGetBdmOrganizationByCondition();
	}
}
