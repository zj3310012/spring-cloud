package com.zj.dataExchange.service.user;

import com.yt.coreapi.utils.ReturnData;
import com.zj.dataExchange.web.model.User;

/**
 * 
 * 
 * @author zhangjing
 * date: 2019年3月14日 上午11:50:57
 */
public interface UserService {

	/**
	  * 根据条件获取用户列表
	 * 
	 * @param userVO
	 * @param currentPage
	 * @param size
	 * @return
	 */
	public ReturnData queryUserListByCondition(User user);
	
	/**
	 * 根据用户id获取用户
	 * 
	 * @param id
	 * @return
	 */
	public ReturnData queryUserById(String id);
	
	/**
	  *  根据用户名获取用户
	 * 
	 * @param username
	 * @return
	 */
	public ReturnData queryUserByUsername(String username);
}
