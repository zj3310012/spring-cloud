package com.yt.uniPlatform.mapper;

import org.apache.ibatis.annotations.Param;

import com.yt.uniPlatform.dataObject.DriverDO;

/**
 * 
 * @author zhangjing
 * date: 2019年3月6日 下午2:14:04
 */
public interface DriverMapper {

	/**
	 * 获取司机详情
	 * 
	 * @param id
	 * @return
	 */
	public DriverDO queryDriverById(@Param("id") String id);
	
	/**
	 * 根据用户id获取司机
	 * 
	 * @param fkUserId
	 * @return
	 */
	public DriverDO queryDriverByFkUserId(@Param("fkUserId") String fkUserId);
}
