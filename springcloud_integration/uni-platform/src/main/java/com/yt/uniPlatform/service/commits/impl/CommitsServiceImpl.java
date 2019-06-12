package com.yt.uniPlatform.service.commits.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.yt.uniPlatform.dataObject.CommitsDO;
import com.yt.uniPlatform.mapper.CommitsMapper;
import com.yt.uniPlatform.service.AbstractServiceImpl;
import com.yt.uniPlatform.service.commits.CommitsService;
import com.yt.uniPlatform.service.commits.dto.CommitsDTO;
import com.yt.uniPlatform.utils.BaseConvert;

/**
 * 
 * @author zhangjing 
 * date: 2019年3月5日 上午10:06:44
 */
@RestController
public class CommitsServiceImpl extends AbstractServiceImpl implements CommitsService {

	@Autowired
	private CommitsMapper commitsMapper;

	@Override
	public PageInfo<CommitsDTO> queryCommitsListByCondition(@RequestBody CommitsDTO commitsDTO) {
	
		pageAndOrder(commitsDTO);
		return returnPageInfo(commitsMapper
				.queryCommitsListByCondition(BaseConvert.convert(commitsDTO, CommitsDO.class)), CommitsDTO.class);
	}

	@Override
	public CommitsDTO queryCommitsById(@RequestParam("id") String id) {
		
		return returnDTO(commitsMapper.queryCommitsById(id), CommitsDTO.class);
	}

}
