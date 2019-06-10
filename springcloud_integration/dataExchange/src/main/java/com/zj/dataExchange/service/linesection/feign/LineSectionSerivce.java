package com.zj.dataExchange.service.linesection.feign;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zj.dataExchange.service.linesection.dto.LineSectionDTO;

@RequestMapping("/linesection")
public interface LineSectionSerivce {

	/**
	 * 根据id查询路段
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/querylinesectionbyid", method = RequestMethod.GET)
	public LineSectionDTO queryDriverById(@RequestParam("id") String id);
}
