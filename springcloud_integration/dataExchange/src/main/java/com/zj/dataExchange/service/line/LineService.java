package com.zj.dataExchange.service.line;

import com.yt.coreapi.utils.ReturnData;
import com.zj.dataExchange.web.model.Line;

/**
 * 
 * 
 * @author zhangjing
 * date: 2019年3月13日 下午6:32:16
 */
public interface LineService {

	/**
	 * 根据条件查询路线列表
	 * 
	 * @param lineDTO
	 * @return
	 */
	public ReturnData queryLineListByCondition(Line line);
	
	/**
	 * 根据id查询线路
	 * 
	 * @param id
	 * @return
	 */
	public ReturnData queryLineById(String id);
}
