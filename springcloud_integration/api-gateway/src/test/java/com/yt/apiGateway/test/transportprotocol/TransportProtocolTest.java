package com.yt.apiGateway.test.transportprotocol;

import com.alibaba.fastjson.JSONObject;
import com.yt.apiGateway.test.AbstractCommon;

public class TransportProtocolTest extends AbstractCommon{

	public static void testGetTransportProtocolByTransNumber() throws Exception {
		String uri = "/transportPro/detail/transNumber";
		String transNumber = "A2016122700001";
		JSONObject paramJson = new JSONObject();
		paramJson.put("transNumber", transNumber);
		String result = testGetObjectByDetail(uri,paramJson);
		System.out.println(result);
	}
	
	public static void testGetTransportProtocolByCondition() throws Exception {
		String uri = "/transportPro/list";
		JSONObject paramJson = new JSONObject();
		paramJson.put("carrierName", "轰轰轰");
		paramJson.put("currentPage", "1");
		paramJson.put("size", "10");
		String result = testGetListByCondition(uri,paramJson);
		System.out.println(result);
	}
	
	public static void main(String[] args) throws Exception {
		//testGetTransportProtocolByTransNumber();
		testGetTransportProtocolByCondition();
	}
}
