package com.yt.uniPlatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.yt.coreapi.dto.UserDTO;
import com.yt.coreapi.serivce.UserService;
import com.yt.coreapi.utils.BaseConvert;
import com.yt.uniPlatform.dataObject.UserDO;
import com.yt.uniPlatform.mapper.UserMapper;

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
