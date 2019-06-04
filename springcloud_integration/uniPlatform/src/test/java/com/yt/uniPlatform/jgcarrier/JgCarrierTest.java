package com.yt.uniPlatform.jgcarrier;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageInfo;
import com.yt.coreapi.dto.JgCarrierDTO;
import com.yt.coreapi.serivce.JgCarrierService;
import com.yt.uniPlatform.UniPlatformApplicationTests;

public class JgCarrierTest extends UniPlatformApplicationTests{

	@Autowired
	private JgCarrierService jgCarrierService;
	
	@Test
	public void testGetJgCarrierListByCondition() {
		JgCarrierDTO jgCarrier = new JgCarrierDTO();
		jgCarrier.setCurrentPage(1);
		jgCarrier.setSize(10);
		jgCarrier.setName("承运商");
		PageInfo<JgCarrierDTO> list = jgCarrierService.queryJgCarrierListByCondition(jgCarrier);
		System.out.println(JSONArray.toJSONString(list));
	}
	
	
}
