package com.yt.dataExchange.service.transportlocation;

import com.yt.coreapi.utils.ReturnData;
import com.yt.dataExchange.web.model.TransportLocation;

/**
 * 
 * @author zhangjing
 * date: 2019年3月14日 上午10:11:55
 */
public interface TransportLocationService {

	/**
	  * 根据条件查询场地信息
	 * 
	 * @param transportLocationVO
	 * @param currentPage
	 * @param size
	 * @return
	 */
	public ReturnData queryTransportLocationListByCondition(TransportLocation transportLocation);
	
	/**
	  * 查询场地详情
	 * 
	 * @param id
	 * @return
	 */
	public ReturnData queryTransportLocationById(String id);
}
