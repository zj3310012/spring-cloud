package com.yt.uniPlatform.service.truck;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.yt.uniPlatform.service.truck.dto.TruckDTO;

/**
 * 
 * @author zhangjing
 * date: 2019年2月28日 下午3:00:30
 */
@RequestMapping("/truck")
public interface TruckService {


	/**
	 * 根据条件获取车辆列表
	 * 
	 * @param truckDTO
	 * @return
	 */
	@RequestMapping(value="/querytrucklistbycondition", method = RequestMethod.POST)
	public PageInfo<TruckDTO> queryTruckListByCondition(@RequestBody TruckDTO truckDTO);
	
	/**
	 * 根据id获取车辆详情
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/querytruckbyid", method = RequestMethod.GET)
	public TruckDTO queryTruckById(@RequestParam("id") String id);
}
