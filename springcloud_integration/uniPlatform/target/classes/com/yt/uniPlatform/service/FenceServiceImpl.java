package com.yt.uniPlatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.yt.coreapi.dto.FenceDTO;
import com.yt.coreapi.serivce.FenceSerivce;
import com.yt.coreapi.utils.BaseConvert;
import com.yt.uniPlatform.dataObject.FenceDO;
import com.yt.uniPlatform.mapper.FenceMapper;

/**
 * 
 * @author zhangjing 
 * date: 2019年3月7日 上午11:45:14
 */
@RestController
public class FenceServiceImpl extends AbstractServiceImpl implements FenceSerivce {

	@Autowired
	private FenceMapper fenceMapper;

	@Override
	public PageInfo<FenceDTO> queryFenceListByCondition(@RequestBody FenceDTO fenceDTO) {
		
		//分页、排序
		pageAndOrder(fenceDTO);
		
		return returnPageInfo(fenceMapper.queryFenceListByCondition(BaseConvert.convert(fenceDTO, FenceDO.class)),
				FenceDTO.class);
	}

}
