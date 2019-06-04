package com.zj.dataExchange.service.truck;

import com.yt.coreapi.utils.ReturnData;
import com.zj.dataExchange.web.model.Truck;

/**
 * 
 * @author zhangjing
 * date: 2019年3月14日 上午11:27:45
 */
public interface TruckService {

	/**
	  * 根据条件获取车辆列表
	 * 
	 * @param truckVO
	 * @param currentPage
	 * @param size
	 * @return
	 */
	public ReturnData queryTruckListByCondition(Truck truck);
	
	/**
	  * 根据id获取车辆详情
	 * 
	 * @param id
	 * @return
	 */
	public ReturnData queryTruckById(String id);
}
