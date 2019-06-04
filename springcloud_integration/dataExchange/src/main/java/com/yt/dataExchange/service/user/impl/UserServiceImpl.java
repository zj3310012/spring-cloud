package com.yt.dataExchange.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yt.coreapi.dto.UserDTO;
import com.yt.coreapi.utils.BaseConvert;
import com.yt.coreapi.utils.ReturnData;
import com.yt.dataExchange.service.AbstractServiceImpl;
import com.yt.dataExchange.service.user.UserClientService;
import com.yt.dataExchange.service.user.UserService;
import com.yt.dataExchange.web.model.User;
import com.yt.dataExchange.web.vo.UserVO;

/**
 * 
 * 
 * @author zhangjing
 * date: 2019年3月14日 下午1:17:31
 */
@Service
public class UserServiceImpl extends AbstractServiceImpl implements UserService{

	@Autowired
	private UserClientService userClientService;
	
	@HystrixCommand(fallbackMethod = "queryUserListByConditionFallback")
	@Override
	public ReturnData queryUserListByCondition(User user) {
		UserDTO userDTO = BaseConvert.convert(user, UserDTO.class);
		PageInfo<UserDTO> pageInfo = userClientService.queryUserListByCondition(userDTO);
		return returnList(pageInfo, UserVO.class);
	}

	@HystrixCommand(fallbackMethod = "queryUserByIdFallback")
	@Override
	public ReturnData queryUserById(String id) {
		UserDTO userDTO = userClientService.queryUserById(id);
		return returnDate(userDTO,UserVO.class);
	}

	@HystrixCommand(fallbackMethod = "queryUserByUsernameFallback")
	@Override
	public ReturnData queryUserByUsername(String username) {
		UserDTO userDTO = userClientService.queryUserByUsername(username);
		return returnDate(userDTO,UserVO.class);
	}
	
	/***********************************降级服务*******************************************/
	public ReturnData queryUserListByConditionFallback(User user,Throwable e) {
		return invokeCallback(user,e,"queryUserListByCondition");
	}
	
	public ReturnData queryUserByIdFallback(String id,Throwable e) {
		return invokeCallback(new String("id:"+id),e,"queryUserById");
	}
	
	public ReturnData queryUserByUsernameFallback(String username,Throwable e) {
		return invokeCallback(new String("username:"+username),e,"queryUserByUsername");
	}
}
