package com.zj.uniPlatform.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.zj.uniPlatform.dataObject.UserDO;
import com.zj.uniPlatform.mapper.UserMapper;
import com.zj.uniPlatform.service.AbstractServiceImpl;
import com.zj.uniPlatform.service.user.UserService;
import com.zj.uniPlatform.service.user.dto.UserDTO;
import com.zj.uniPlatform.utils.BaseConvert;

/**
 * 
 * @author zhangjing
 * date: 2019年2月22日 下午2:31:57
 */
@RestController
public class UserServiceImpl extends AbstractServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public PageInfo<UserDTO> queryUserListByCondition(@RequestBody UserDTO userDTO) {

		pageAndOrder(userDTO);
		
		return returnPageInfo(userMapper.queryUserListByCondition(BaseConvert.convert(userDTO, UserDO.class)), UserDTO.class);
	}

	@Override
	public UserDTO queryUserById(@RequestParam("id") String id) {
		return returnDTO(userMapper.queryUserById(id), UserDTO.class);
	}

	@Override
	public UserDTO queryUserByUsername(@RequestParam("username") String username) {
		
		return returnDTO(userMapper.queryUserByUsername(username), UserDTO.class);
	}

}
