package com.yt.uniPlatform.mapper;

import org.apache.ibatis.annotations.Param;

import com.yt.uniPlatform.dataObject.CarrierTruckCommitDO;

/**
 * 
 * @author zhangjing
 * date: 2019年3月4日 下午3:45:25
 */
public interface CarrierTruckCommitMapper {

	/**
	  *  通过车牌号获取车辆审核记录
	 * 
	 * @param fkTruckPlate
	 * @return
	 */
	public CarrierTruckCommitDO queryCarrierTruckCommitByFkTruckPlate(@Param("fkTruckPlate") String fkTruckPlate);
}
