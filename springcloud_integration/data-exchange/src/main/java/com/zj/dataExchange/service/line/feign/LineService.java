package com.zj.dataExchange.service.line.feign;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.zj.dataExchange.service.line.dto.LineDTO;

/**
 * 
 * @author zhangjing
 * date: 2019年2月26日 上午10:44:35
 */
@RequestMapping("/line")
public interface LineService {
	
	/**
	 * 根据条件查询路线
	 * 
	 * @param lineDTO
	 * @return
	 */
	@RequestMapping(value = "/querylinelistbycondition", method = RequestMethod.POST)
	public PageInfo<LineDTO> queryLineListByCondition(@RequestBody LineDTO lineDTO);

	/**
	 * 根据id查询线路
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/querylinebyid", method = RequestMethod.GET)
	public LineDTO queryLineById(@RequestParam("id") String id);

}
