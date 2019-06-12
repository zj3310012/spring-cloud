package com.yt.uniPlatform.user;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.yt.uniPlatform.UniPlatformApplicationTests;
import com.yt.uniPlatform.service.user.UserService;
import com.yt.uniPlatform.service.user.dto.UserDTO;

public class UserTest extends UniPlatformApplicationTests{

	@Autowired
	private UserService userService;
	
	@Test
	public void testGetUserListByCondition() {
		UserDTO user = new UserDTO();
		user.setRoleType(0);
		user.setCurrentPage(1);
		user.setSize(10);
		PageInfo<UserDTO> list = userService.queryUserListByCondition(user);
		System.out.println(JSONArray.toJSONString(list));
	}
	
	@Test
	public void testGetUserByUsername() {
		UserDTO user = userService.queryUserByUsername("18811111111");
		System.out.println(JSONObject.toJSONString(user));
	}
	
}
