package com.yt.uniPlatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.yt.coreapi.dto.LineSectionDTO;
import com.yt.coreapi.serivce.LineSectionSerivce;
import com.yt.uniPlatform.mapper.LineSectionMapper;

/**
 * 
 * @author zhangjing
 * date: 2019年3月25日 上午11:16:36
 */
@RestController
public class LineSectionServiceImpl extends AbstractServiceImpl implements LineSectionSerivce{

	@Autowired
	private LineSectionMapper lineSectionMapper;
	
	@Override
	public LineSectionDTO queryDriverById(String id) {
		
		return returnDTO(lineSectionMapper.queryLineSectionById(id),LineSectionDTO.class);
	}

}
