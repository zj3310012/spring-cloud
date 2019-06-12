package com.zj.dataExchange.service.jgCarrier.feign;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pagehelper.PageInfo;
import com.zj.dataExchange.service.jgCarrier.dto.JgCarrierDTO;

/**
 * 
 * @author zhangjing
 * date: 2019年2月27日 下午6:21:39
 */
@RequestMapping("/jgcarrier")
public interface JgCarrierService {

	/**
	 * 根据条件查询金刚承运商
	 * 
	 * @param jgCarrierDTO
	 * @return
	 */
	@RequestMapping(value="/queryjgcarrierlistbycondition", method = RequestMethod.POST)
	public PageInfo<JgCarrierDTO> queryJgCarrierListByCondition(@RequestBody JgCarrierDTO jgCarrierDTO);
}
