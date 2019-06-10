package com.zj.dataExchange.service.carriertruckcommit;

import com.zj.dataExchange.utils.ReturnData;

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
