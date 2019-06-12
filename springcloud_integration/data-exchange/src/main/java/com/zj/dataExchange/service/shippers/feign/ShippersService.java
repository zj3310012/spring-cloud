package com.zj.dataExchange.service.shippers.feign;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zj.dataExchange.service.shippers.dto.ShippersDTO;

/**
 * 
 * @author zhangjing
 * date: 2019年3月1日 下午5:00:48
 */
@RequestMapping("/shippers")
public interface ShippersService {

	/**
	 * 查看承运商资质
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/queryshippersbyid", method = RequestMethod.GET)
	public ShippersDTO queryShippersById(@RequestParam("id") String id);
}
