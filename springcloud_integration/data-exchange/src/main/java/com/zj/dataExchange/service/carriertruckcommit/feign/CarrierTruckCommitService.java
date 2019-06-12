package com.zj.dataExchange.service.carriertruckcommit.feign;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zj.dataExchange.service.carriertruckcommit.dto.CarrierTruckCommitDTO;

/**
 * 
 * @author zhangjing
 * date: 2019年3月4日 下午3:23:38
 */
@RequestMapping("/carriertruckcommit")
public interface CarrierTruckCommitService {


	/**
	 * 根据车牌号获取车辆审核记录
	 * 
	 * @param fkTruckPlate
	 * @return
	 */
	@RequestMapping(value = "/querycarriertruckcommitbyfktruckplate", method = RequestMethod.GET)
	public CarrierTruckCommitDTO queryCarrierTruckCommitByFkTruckPlate(@RequestParam("fkTruckPlate") String fkTruckPlate);
}
