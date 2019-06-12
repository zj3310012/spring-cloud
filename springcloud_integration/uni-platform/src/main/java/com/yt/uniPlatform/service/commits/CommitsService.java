package com.yt.uniPlatform.service.commits;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.yt.uniPlatform.service.commits.dto.CommitsDTO;

/**
 * 
 * @author zhangjing
 * date: 2019年3月7日 上午11:19:00
 */
@RequestMapping("/commits")
public interface CommitsService {

	/**
	 * 根据条件查询承运商资质审核结果
	 * 
	 * @param commitsDTO
	 * @return
	 */
	@RequestMapping(value="/querycommitslistbycondition", method=RequestMethod.POST)
	public PageInfo<CommitsDTO> queryCommitsListByCondition(@RequestBody CommitsDTO commitsDTO);
	
	/**
	 * 根据id查询承运商资质审核结果详情
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/querycommitsbyid", method=RequestMethod.GET)
	public CommitsDTO queryCommitsById(@RequestParam("id") String id);
}
