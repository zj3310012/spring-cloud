package com.yt.uniPlatform.mapper;

import org.apache.ibatis.annotations.Param;

import com.yt.uniPlatform.dataObject.ShippersDO;

/**
 * 
 * @author zhangjing
 * date: 2019年3月1日 下午5:06:38
 */
public interface ShippersMapper {

	/**
	 * 查看承运商资质
	 * 
	 * @param id
	 * @return
	 */
	public ShippersDO queryShippersById(@Param("id") String id);
}
