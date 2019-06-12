package com.yt.uniPlatform.service.user;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.yt.uniPlatform.service.user.dto.UserDTO;

/**
 * 
 * @author zhangjing
 * date: 2019年2月22日 下午2:21:55
 */
@RequestMapping("/user")
public interface UserService {

	/**
	 * 根据条件获取用户列表
	 * 
	 * @param userDTO
	 * @return
	 */
	@RequestMapping(value = "/queryuserlistbycondition", method = RequestMethod.POST)
	public PageInfo<UserDTO> queryUserListByCondition(@RequestBody UserDTO userDTO);
	
	/**
	 * 根据用户id获取用户
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/queryuserbyid", method = RequestMethod.GET)
	public UserDTO queryUserById(@RequestParam("id") String id);
	
	/**
	  *  根据用户名获取用户
	 * 
	 * @param username
	 * @return
	 */
	@RequestMapping(value = "/queryuserbyusername", method = RequestMethod.GET)
	public UserDTO queryUserByUsername(@RequestParam("username") String username);
}
