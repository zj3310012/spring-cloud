package com.zj.dataExchange.service.transportlocation.fegin;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.zj.dataExchange.service.transportlocation.dto.TransportLocationDTO;

/**
 * 
 * @author zhangjing
 * date: 2019年2月25日 上午10:07:25
 */
@RequestMapping("/transportlocation")
public interface TransportLocationService {



	/**
	 * 根据条件查询场地信息
	 * 
	 * @param transportLocationDTO
	 * @return
	 */
	@RequestMapping(value = "/querytransportlocationlistbycondition", method = RequestMethod.POST)
	public PageInfo<TransportLocationDTO> queryTransportLocationListByCondition(@RequestBody TransportLocationDTO transportLocationDTO);
	
	/**
	 * 查询场地详情
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/querytransportlocationbyid", method = RequestMethod.GET)
	public TransportLocationDTO queryTransportLocationById(@RequestParam("id") String id);
}
