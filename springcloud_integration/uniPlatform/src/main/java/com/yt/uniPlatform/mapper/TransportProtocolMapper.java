package com.yt.uniPlatform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yt.uniPlatform.dataObject.TransportProtocolDO;

/**
 * 
 * @author zhangjing
 * date: 2019年2月22日 下午2:23:23
 */
public interface TransportProtocolMapper {

	/**
	 * 根据条件获取运单列表
	 * @param transportProtocol
	 * @return
	 */
	public List<TransportProtocolDO> queryTransportProtocolByCondition(@Param("transportProtocol")TransportProtocolDO transportProtocol);
	
	/**
	 * 根据运单号获取运单
	 * 
	 * @param transNumber
	 * @return
	 */
	public TransportProtocolDO queryTransportProtocolByTransNumber(@Param("transNumber")String transNumber);
	
	/**
	 * 根据id获取运单
	 * 
	 * @param id
	 * @return
	 */
	public TransportProtocolDO queryTransportProtocolById(@Param("id")String id);
}
