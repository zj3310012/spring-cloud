package com.zj.dataExchange.service.fence.feign;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pagehelper.PageInfo;
import com.zj.dataExchange.service.fence.dto.FenceDTO;

/**
 * 
 * @author zhangjing
 * date: 2019年3月7日 上午11:04:49
 */
@RequestMapping("/fence")
public interface FenceSerivce {

	/**
	 * 获取围栏信息
	 * 
	 * @param fenceDTO
	 * @return
	 */
	@RequestMapping(value = "/queryfencelistbycondition", method = RequestMethod.POST)
	public PageInfo<FenceDTO> queryFenceListByCondition(@RequestBody FenceDTO fenceDTO);
}
