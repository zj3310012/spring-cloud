package com.yt.apiGateway.mapper;

import org.apache.ibatis.annotations.Param;

import com.yt.apiGateway.dataObject.UserDO;

/**
 * 
 * @author zhangjing
 * date: 2019年3月26日 下午5:49:49
 */
public interface UserMapper {

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
	public UserDO queryUserByUserCode(@Param("userCode") String userCode);
}
