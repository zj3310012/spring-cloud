package com.yt.dataExchange.service.fence;

import com.yt.coreapi.utils.ReturnData;
import com.yt.dataExchange.web.model.Fence;

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
