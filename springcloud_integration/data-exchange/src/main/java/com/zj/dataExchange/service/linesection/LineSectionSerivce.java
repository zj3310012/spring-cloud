package com.zj.dataExchange.service.linesection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zj.dataExchange.utils.ReturnData;

/**
 * 
 * 
 * @author zhangjing
 * date: 2019年3月25日 上午11:24:59
 */
public interface LineSectionSerivce {

	/**
	 * 根据id查询路段详情
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/querylinesectionbyid", method = RequestMethod.GET)
	public ReturnData queryLineSectionById(String id);
}
