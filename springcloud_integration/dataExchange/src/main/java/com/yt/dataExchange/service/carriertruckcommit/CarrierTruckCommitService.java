package com.yt.dataExchange.service.carriertruckcommit;

import com.yt.coreapi.utils.ReturnData;

/**
 * 
 * @author zhangjing
 * date: 2019年3月13日 下午4:41:33
 */
public interface CarrierTruckCommitService {

	/**
	 * 根据车牌号获取车辆审核记录
	 * 
	 * @param fkTruckPlate
	 * @return
	 */
	public ReturnData queryCarrierTruckCommitByFkTruckPlate(String fkTruckPlate);
}
