package com.yt.uniPlatform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yt.uniPlatform.dataObject.TransportLocationDO;

/**
 * 
 * @author zhangjing 
 * date: 2019年2月25日 上午11:19:38
 */
public interface TransportLocationMapper {

	/**
	 * 根据条件查询场地信息
	 * 
	 * @param transportLocation
	 * @return
	 */
	public List<TransportLocationDO> queryTransportLocationListByCondition(
			@Param("transportLocation") TransportLocationDO transportLocation);
	
	
	/**
	  *  查询场地详情
	 * 
	 * @param id
	 * @return
	 */
	public TransportLocationDO queryTransportLocationById(@Param("id") String id);

}
