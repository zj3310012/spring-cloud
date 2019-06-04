package com.yt.uniPlatform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yt.uniPlatform.dataObject.TruckDO;

/**
 * 
 * @author zhangjing
 * date: 2019年2月28日 下午5:01:37
 */
public interface TruckMapper {

	/**
	 * 根据条件获取车辆列表
	 * 
	 * @param truck
	 * @return
	 */
	public List<TruckDO> queryTruckListByCondition(@Param("truck") TruckDO truck); 
	
	/**
	 * 根据id获取车辆详情
	 * 
	 * @param id
	 * @return
	 */
	public TruckDO queryTruckById(@Param("id") String id);
}
