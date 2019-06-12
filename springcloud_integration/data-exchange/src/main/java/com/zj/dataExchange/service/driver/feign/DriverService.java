package com.zj.dataExchange.service.driver.feign;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zj.dataExchange.service.driver.dto.DriverDTO;

/**
 * 
 * @author zhangjing
 * date: 2019年3月7日 上午11:19:08
 */
@RequestMapping("/driver")
public interface DriverService {

	/**
	 * 获取司机详情
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/querydriverbyid", method = RequestMethod.GET)
	public DriverDTO queryDriverById(@RequestParam("id") String id);
	
	/**
	 * 根据用户id获取司机
	 * 
	 * @param fkUserId
	 * @return
	 */
	@RequestMapping(value = "querydriverbyfkuserid", method = RequestMethod.GET)
	public DriverDTO queryDriverByFkUserId(@RequestParam("fkUserId") String fkUserId);
	
}
