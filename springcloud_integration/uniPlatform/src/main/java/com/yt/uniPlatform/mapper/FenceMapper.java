package com.yt.uniPlatform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yt.uniPlatform.dataObject.FenceDO;

/**
 * 
 * @author zhangjing
 * date: 2019年3月7日 上午11:24:23
 */
public interface FenceMapper {

	/**
	  *  获取围栏信息
	 * 
	 * @param fence
	 * @return
	 */
	public List<FenceDO> queryFenceListByCondition(@Param("fence") FenceDO fence);
}
