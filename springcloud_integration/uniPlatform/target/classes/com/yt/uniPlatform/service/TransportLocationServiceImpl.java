package com.yt.uniPlatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.yt.coreapi.dto.TransportLocationDTO;
import com.yt.coreapi.serivce.TransportLocationService;
import com.yt.coreapi.utils.BaseConvert;
import com.yt.uniPlatform.dataObject.TransportLocationDO;
import com.yt.uniPlatform.mapper.TransportLocationMapper;

/**
 * 
 * @author zhangjing 
 * date: 2019年2月25日 下午3:29:54
 */
@RestController
public class TransportLocationServiceImpl extends AbstractServiceImpl implements TransportLocationService {

	@Autowired
	private TransportLocationMapper transportLocationMapper;

	@Override
	public PageInfo<TransportLocationDTO> queryTransportLocationListByCondition(
			@RequestBody TransportLocationDTO transportLocationDTO) {

		pageAndOrder(transportLocationDTO);

		return returnPageInfo(
				transportLocationMapper.queryTransportLocationListByCondition(
						BaseConvert.convert(transportLocationDTO, TransportLocationDO.class)),
				TransportLocationDTO.class);
	}

	@Override
	public TransportLocationDTO queryTransportLocationById(@RequestParam("id") String id) {

		return returnDTO(transportLocationMapper.queryTransportLocationById(id), TransportLocationDTO.class);
	}

}