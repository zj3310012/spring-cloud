package com.yt.uniPlatform.commits;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.yt.coreapi.dto.CommitsDTO;
import com.yt.coreapi.serivce.CommitsService;
import com.yt.uniPlatform.UniPlatformApplicationTests;

public class CommitsTest extends UniPlatformApplicationTests{

	@Autowired
	private CommitsService commitsService;
	
	@Test
	public void testGetCommitsListByCondition() {
		CommitsDTO commits = new CommitsDTO();
		commits.setCurrentPage(1);
		commits.setSize(10);
		commits.setShipperId(113);
		PageInfo<CommitsDTO> list = commitsService.queryCommitsListByCondition(commits);
		System.out.println(JSONArray.toJSONString(list));
	}
	
	@Test
	public void testGetCommitsById() {
		CommitsDTO commits = commitsService.queryCommitsById("123");
		System.out.println(JSONObject.toJSONString(commits));
	}
}
