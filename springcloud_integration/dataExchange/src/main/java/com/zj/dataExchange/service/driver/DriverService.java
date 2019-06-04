package com.zj.dataExchange.service.driver;

import com.yt.coreapi.utils.ReturnData;

/**
 * 
 * @author zhangjing
 * date: 2019年3月13日 下午4:57:15
 */
public interface DriverService {

	/**
	 * 获取司机详情
	 * 
	 * @param id
	 * @return
	 */
	public ReturnData queryDriverById(String id);
	
	/**
	 * 根据用户id获取司机
	 * 
	 * @param fkUserId
	 * @return
	 */
	public ReturnData queryDriverByFkUserId(String fkUserId);
}
