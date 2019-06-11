package com.yt.uniPlatform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yt.uniPlatform.dataObject.LineDO;

/**
 * 
 * @author zhangjing
 * date: 2019年2月26日 下午1:29:11
 */
public interface LineMapper {

	/**
	 * 根据条件查询线路
	 * 
	 * @param line
	 * @return
	 */
	public List<LineDO> queryLineListByCondition(@Param("line") LineDO line);
	
	/**
	 * 根据id获取线路信息
	 * 
	 * @param id
	 * @return
	 */
	public LineDO queryLineById(@Param("id") String id);
}
