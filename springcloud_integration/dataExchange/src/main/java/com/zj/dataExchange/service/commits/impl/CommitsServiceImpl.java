package com.zj.dataExchange.service.commits.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yt.coreapi.dto.CommitsDTO;
import com.yt.coreapi.utils.BaseConvert;
import com.yt.coreapi.utils.ReturnData;
import com.zj.dataExchange.service.AbstractServiceImpl;
import com.zj.dataExchange.service.commits.CommitsService;
import com.zj.dataExchange.service.commits.feign.CommitsClientService;
import com.zj.dataExchange.web.model.Commits;
import com.zj.dataExchange.web.vo.CommitsVO;

/**
 * 
 * @author zhangjing
 * date: 2019年3月15日 下午6:09:09
 */
@Service
public class CommitsServiceImpl extends AbstractServiceImpl implements CommitsService{

	@Autowired
	private CommitsClientService commitsClientService;
	
	@HystrixCommand(fallbackMethod = "queryCommitsByIdFallback")
	@Override
	public ReturnData queryCommitsById(String id) {
		CommitsDTO commitsDTO = commitsClientService.queryCommitsById(id);
		return returnDate(commitsDTO, CommitsVO.class);
	}

	@HystrixCommand(fallbackMethod = "queryCommitsListByConditionFallback")
	@Override
	public ReturnData queryCommitsListByCondition(Commits commits) {
		CommitsDTO commitsDTO = BaseConvert.convert(commits, CommitsDTO.class);
		PageInfo<CommitsDTO> pageInfo = commitsClientService.queryCommitsListByCondition(commitsDTO);
		return returnList(pageInfo, CommitsVO.class);
	}

	/***********************************降级服务*******************************************/
	public ReturnData queryCommitsByIdFallback(String id,Throwable e) {
		return invokeCallback(new String("id:"+id),e,"queryCommitsById");
	}
	
	public ReturnData queryCommitsListByConditionFallback(Commits commits,Throwable e) {
		return invokeCallback(commits,e,"queryCommitsListByCondition");
	}
}
