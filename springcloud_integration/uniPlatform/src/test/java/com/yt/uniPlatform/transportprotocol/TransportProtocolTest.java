package com.yt.uniPlatform.transportprotocol;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.yt.coreapi.dto.TransportProtocolDTO;
import com.yt.coreapi.serivce.TransportProtocolService;
import com.yt.uniPlatform.UniPlatformApplicationTests;


public class TransportProtocolTest extends UniPlatformApplicationTests{

	@Autowired 
	private TransportProtocolService transportProtocolService;
	
	@Test
	public void testGetTransportProtocolByTransNumber() {
		TransportProtocolDTO transportProtocol = transportProtocolService.queryTransportProtocolByTransNumber("A2016122700001");
		System.out.println(JSONObject.toJSONString(transportProtocol));
	}
	
	@Test
	public void testGetTransportProtocolByCondition() {
		TransportProtocolDTO transportProtocol = new TransportProtocolDTO();
		transportProtocol.setCurrentPage(1);
		transportProtocol.setSize(10);
		transportProtocol.setCarrierName("轰轰轰");
		PageInfo<TransportProtocolDTO> list = transportProtocolService.queryTransportProtocolListByCondition(transportProtocol);
		System.out.println(JSONArray.toJSONString(list));
	}
	
}
