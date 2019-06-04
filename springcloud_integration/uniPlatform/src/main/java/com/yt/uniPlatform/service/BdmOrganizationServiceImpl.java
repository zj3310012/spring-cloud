package com.yt.uniPlatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.yt.coreapi.dto.BdmOrganizationDTO;
import com.yt.coreapi.serivce.BdmOrganizationService;
import com.yt.coreapi.utils.BaseConvert;
import com.yt.uniPlatform.dataObject.BdmOrganizationDO;
import com.yt.uniPlatform.mapper.BdmOrganizationMapper;

/**
 * 
 * @author zhangjing 
 * date: 2019年2月27日 下午2:58:03
 */
@RestController
public class BdmOrganizationServiceImpl extends AbstractServiceImpl implements BdmOrganizationService {

	@Autowired
	private BdmOrganizationMapper bdmOrganizationMapper;

	@Override
	public PageInfo<BdmOrganizationDTO> queryBdmOrganizationListByCondition(
			@RequestBody BdmOrganizationDTO bdmOrganizationDTO) {

		//分页、排序
		pageAndOrder(bdmOrganizationDTO);
		return returnPageInfo(bdmOrganizationMapper.queryBdmOrganizationListByCondition(
				BaseConvert.convert(bdmOrganizationDTO, BdmOrganizationDO.class)), BdmOrganizationDTO.class);
	}

	@Override
	public BdmOrganizationDTO queryBdmOrganizationById(@RequestParam("id") String id) {
		
		return returnDTO(bdmOrganizationMapper.queryBdmOrganizationById(id), BdmOrganizationDTO.class);
	}

}
