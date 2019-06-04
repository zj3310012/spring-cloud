package com.zj.dataExchange.service.shippers;

import com.yt.coreapi.utils.ReturnData;

/**
 * 
 * @author zhangjing
 * date: 2019年3月14日 上午10:05:49
 */
public interface ShippersService {

	/**
	  *  查看承运商资质
	 * 
	 * @param id
	 * @return
	 */
	public ReturnData queryShippersById(String id);
}
