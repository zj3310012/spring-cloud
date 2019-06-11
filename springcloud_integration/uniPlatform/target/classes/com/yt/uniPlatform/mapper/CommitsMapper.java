package com.yt.uniPlatform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yt.uniPlatform.dataObject.CommitsDO;

/**
 * 
 * @author zhangjing
 * date: 2019年3月4日 下午6:20:56
 */
public interface CommitsMapper {

	/**
	 *  根据条件查询承运商资质审核结果
	 * 
	 * @param commits
	 * @return
	 */
	public List<CommitsDO> queryCommitsListByCondition(@Param("commits") CommitsDO commits);
	
	/**
	 *  根据id查询承运商资质审核结果详情
	 * 
	 * @param id
	 * @return
	 */
	public CommitsDO queryCommitsById(@Param("id") String id);
}
