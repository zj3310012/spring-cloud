package com.yt.uniPlatform.service.truck.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.yt.uniPlatform.dataObject.TruckDO;
import com.yt.uniPlatform.mapper.TruckMapper;
import com.yt.uniPlatform.service.AbstractServiceImpl;
import com.yt.uniPlatform.service.truck.TruckService;
import com.yt.uniPlatform.service.truck.dto.TruckDTO;
import com.yt.uniPlatform.utils.BaseConvert;

/**
 * 
 * @author zhangjing
 * date: 2019年4月2日 下午2:34:41
 */
@RestController
public class TruckServiceImpl extends AbstractServiceImpl implements TruckService{
	
	@Autowired
	private TruckMapper truckMapper;

	@Override
	public PageInfo<TruckDTO> queryTruckListByCondition(@RequestBody TruckDTO truckDTO) {
		
		pageAndOrder(truckDTO);
		
		return returnPageInfo(truckMapper.queryTruckListByCondition(BaseConvert.convert(truckDTO, TruckDO.class)), TruckDTO.class);
	}

	@Override
	public TruckDTO queryTruckById(@RequestParam("id") String id) {
		
		return returnDTO(truckMapper.queryTruckById(id), TruckDTO.class);
	}

}
