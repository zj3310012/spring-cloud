package com.yt.uniPlatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.yt.coreapi.dto.LineDTO;
import com.yt.coreapi.serivce.LineService;
import com.yt.coreapi.utils.BaseConvert;
import com.yt.uniPlatform.dataObject.LineDO;
import com.yt.uniPlatform.mapper.LineMapper;

/**
 * 
 * @author zhangjing
 * date: 2019年2月26日 下午2:41:29
 */
@RestController
public class LineServiceImpl extends AbstractServiceImpl implements LineService{

	@Autowired
	private LineMapper lineMapper;
	
	@Override
	public PageInfo<LineDTO> queryLineListByCondition(@RequestBody LineDTO lineDTO) {
		
		pageAndOrder(lineDTO);
		
		return returnPageInfo(lineMapper.queryLineListByCondition(BaseConvert.convert(lineDTO, LineDO.class)), LineDTO.class);
	}

	@Override
	public LineDTO queryLineById(@RequestParam("id") String id) {
		
		return returnDTO(lineMapper.queryLineById(id), LineDTO.class);
	}

}
