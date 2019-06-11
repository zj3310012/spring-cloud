package com.yt.uniPlatform.mapper;

import org.apache.ibatis.annotations.Param;

import com.yt.uniPlatform.dataObject.LineSectionDO;

/**
 * 
 * @author zhangjing
 * date: 2019年3月25日 上午11:07:19
 */
public interface LineSectionMapper {

	/**
	 * 根据id查询路段详情
	 * 
	 * @param id
	 * @return
	 */
	public LineSectionDO queryLineSectionById(@Param("id") String id);
}
