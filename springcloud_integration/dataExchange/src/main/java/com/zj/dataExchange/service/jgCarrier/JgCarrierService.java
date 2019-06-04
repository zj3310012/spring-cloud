package com.zj.dataExchange.service.jgCarrier;

import com.yt.coreapi.utils.ReturnData;
import com.zj.dataExchange.web.model.JgCarrier;

/**
 * 
 * @author zhangjing
 * date: 2019年3月13日 下午5:04:04
 */
public interface JgCarrierService {
	

	/**
	 * 根据条件查询金刚承运商
	 * 
	 * @param jgCarrierVO
	 * @param currentPage
	 * @param size
	 * @return
	 */
	public ReturnData queryJgCarrierListByCondition(JgCarrier jgCarrier);
}
