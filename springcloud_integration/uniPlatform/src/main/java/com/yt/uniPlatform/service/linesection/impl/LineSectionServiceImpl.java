package com.yt.uniPlatform.service.linesection.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.yt.uniPlatform.mapper.LineSectionMapper;
import com.yt.uniPlatform.service.AbstractServiceImpl;
import com.yt.uniPlatform.service.linesection.LineSectionSerivce;
import com.yt.uniPlatform.service.linesection.dto.LineSectionDTO;

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
