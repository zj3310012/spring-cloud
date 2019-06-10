package com.zj.dataExchange.service.transportprotocol.feign;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.zj.dataExchange.service.transportprotocol.dto.TransportProtocolDTO;

/**
 * 
 * @author zhangjing
 * date: 2019年2月22日 下午2:22:03
 */
@RequestMapping("/transportprotocol")
public interface TransportProtocolService {


	/**
	 * 根据条件获取运单列表
	 * 
	 * @param transportProtocolDTO
	 * @return
	 */
	@RequestMapping(value = "/querytransportprotocollistbycondition", method = RequestMethod.POST)
	public PageInfo<TransportProtocolDTO> queryTransportProtocolListByCondition(@RequestBody TransportProtocolDTO transportProtocolDTO);
	
	/**
	 * 根据运单号获取运单
	 * 
	 * @param transNumber
	 * @return
	 */
	@RequestMapping(value = "/querytransportprotocolbytransnumber", method = RequestMethod.GET)
	public TransportProtocolDTO queryTransportProtocolByTransNumber(@RequestParam("transNumber") String transNumber);
	
	/**
	 * 根据id获取运单
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/querytransportprotocolbyid", method = RequestMethod.GET)
	public TransportProtocolDTO queryTransportProtocolById(@RequestParam("id") String id);
}
