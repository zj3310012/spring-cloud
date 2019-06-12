package com.yt.uniPlatform.service.shippers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yt.uniPlatform.mapper.ShippersMapper;
import com.yt.uniPlatform.service.AbstractServiceImpl;
import com.yt.uniPlatform.service.shippers.ShippersService;
import com.yt.uniPlatform.service.shippers.dto.ShippersDTO;

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
