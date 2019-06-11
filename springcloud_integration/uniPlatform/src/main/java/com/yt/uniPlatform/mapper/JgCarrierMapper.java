package com.yt.uniPlatform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yt.uniPlatform.dataObject.JgCarrierDO;

/**
 * 
 * @author zhangjing
 * date: 2019年2月27日 下午6:28:21
 */
public interface JgCarrierMapper {

	/**
	 * 根据条件查询金刚承运商
	 * 
	 * @param jgCarrier
	 * @return
	 */
	public List<JgCarrierDO> queryJgCarrierListByCondition(@Param("jgCarrier") JgCarrierDO jgCarrier);
}
