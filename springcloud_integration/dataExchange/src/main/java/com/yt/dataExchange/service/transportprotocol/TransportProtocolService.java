package com.yt.dataExchange.service.transportprotocol;

import com.yt.coreapi.utils.ReturnData;
import com.yt.dataExchange.web.model.TransportProtocol;

/**
 * 
 * 
 * @author zhangjing
 * date: 2019年3月14日 上午10:35:20
 */
public interface TransportProtocolService {

	/**
	  * 根据条件获取运单列表
	 * 
	 * @param transportProtocolVO
	 * @param currentPage
	 * @param size
	 * @return
	 */
	public ReturnData queryTransportProtocolListByCondition(TransportProtocol transportProtocol);
	
	/**
	  * 根据运单号获取运单
	 * 
	 * @param transNumber
	 * @return
	 */
	public ReturnData queryTransportProtocolByTransNumber(String transNumber);
	
	/**
	  * 根据id获取运单
	 * 
	 * @param id
	 * @return
	 */
	public ReturnData queryTransportProtocolById(String id);
}
