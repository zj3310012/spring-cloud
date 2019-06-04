package com.yt.uniPlatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yt.coreapi.dto.ShippersDTO;
import com.yt.coreapi.serivce.ShippersService;
import com.yt.uniPlatform.mapper.ShippersMapper;

/**
 * 
 * @author zhangjing
 * date: 2019年3月1日 下午5:36:08
 */
@RestController
public class ShippersServiceImpl extends AbstractServiceImpl implements ShippersService{
	
	@Autowired 
	private ShippersMapper shippersMapper;

	@Override
	public ShippersDTO queryShippersById(@RequestParam("id") String id) {
		
		return returnDTO(shippersMapper.queryShippersById(id), ShippersDTO.class);
	}

}
