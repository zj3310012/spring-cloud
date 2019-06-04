package com.zj.dataExchange.service.commits;

import com.yt.coreapi.utils.ReturnData;
import com.zj.dataExchange.web.model.Commits;

/**
 * 
 * @author zhangjing
 * date: 2019年3月13日 下午4:44:36
 */
public interface CommitsService {

	/**
	 * 根据id查询承运商资质审核结果详情
	 * 
	 * @param id
	 * @return
	 */
	public ReturnData queryCommitsById(String id);

	/**
	 * 根据条件查询承运商资质审核结果
	 * 
	 * @param commitsVO
	 * @param currentPage
	 * @param size
	 * @return
	 */
	public ReturnData queryCommitsListByCondition(Commits commits);
}
