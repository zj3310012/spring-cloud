package com.yt.uniPlatform.service.jgCarrier.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.yt.uniPlatform.dataObject.JgCarrierDO;
import com.yt.uniPlatform.mapper.JgCarrierMapper;
import com.yt.uniPlatform.service.AbstractServiceImpl;
import com.yt.uniPlatform.service.jgCarrier.JgCarrierService;
import com.yt.uniPlatform.service.jgCarrier.dto.JgCarrierDTO;
import com.yt.uniPlatform.utils.BaseConvert;

/**
 * 
 * @author zhangjing 
 * date: 2019年2月28日 下午1:32:02
 */
@RestController
public class JgCarrierServiceImpl extends AbstractServiceImpl implements JgCarrierService {

	@Autowired
	private JgCarrierMapper jgCarrierMapper;

	@Override
	public PageInfo<JgCarrierDTO> queryJgCarrierListByCondition(@RequestBody JgCarrierDTO jgCarrierDTO) {
		// 分页、排序
		pageAndOrder(jgCarrierDTO);

		return returnPageInfo(
				jgCarrierMapper.queryJgCarrierListByCondition(BaseConvert.convert(jgCarrierDTO, JgCarrierDO.class)),
				JgCarrierDTO.class);
	}

}
