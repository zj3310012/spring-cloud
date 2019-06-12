package com.yt.uniPlatform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yt.uniPlatform.dataObject.UserDO;

/**
 * 
 * @author zhangjing
 * date: 2019年2月22日 下午2:31:00
 */
public interface UserMapper {

	/**
	 * 根据条件获取用户列表
	 * 
	 * @param user
	 * @return
	 */
	public List<UserDO> queryUserListByCondition(@Param("user") UserDO user);
	
	/**
	 * 根据用户id获取用户
	 * 
	 * @param id
	 * @return
	 */
	public UserDO queryUserById(@Param("id") String id);
	
	/**
	 * 根据用户名获取用户
	 * 
	 * @param username
	 * @return
	 */
	public UserDO queryUserByUsername(@Param("username") String username);
}
