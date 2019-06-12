package com.zj.dataExchange.service.fence;

import com.zj.dataExchange.utils.ReturnData;
import com.zj.dataExchange.web.model.Fence;

/**
 * 
 * 
 * @author zhangjing
 * date: 2019年3月18日 上午10:39:11
 */
public interface FenceService {

	/**
	 * 获取围栏信息
	 * 
	 * @param fenceDTO
	 * @return
	 */
	public ReturnData queryFenceListByCondition(Fence fence);
}
