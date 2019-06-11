package com.yt.uniPlatform.fence;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageInfo;
import com.yt.uniPlatform.UniPlatformApplicationTests;
import com.yt.uniPlatform.service.fence.FenceSerivce;
import com.yt.uniPlatform.service.fence.dto.FenceDTO;

public class FenceTest extends UniPlatformApplicationTests{

	@Autowired
	private FenceSerivce fenceSerivce;
	
	@Test
	public void testGetFenceListByCondition() {
		FenceDTO fence = new FenceDTO();
		//fence.setFkTransNumber("A2016122600001");
		fence.setFkLocationCode("000003");
		PageInfo<FenceDTO> list = fenceSerivce.queryFenceListByCondition(fence);
		System.out.println(JSONArray.toJSONString(list));
		
	}
}
