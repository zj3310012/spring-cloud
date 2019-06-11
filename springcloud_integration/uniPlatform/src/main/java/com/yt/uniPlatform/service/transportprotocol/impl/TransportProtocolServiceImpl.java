package com.yt.uniPlatform.service.transportprotocol.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.yt.uniPlatform.dataObject.TransportProtocolDO;
import com.yt.uniPlatform.mapper.TransportProtocolMapper;
import com.yt.uniPlatform.service.AbstractServiceImpl;
import com.yt.uniPlatform.service.transportprotocol.TransportProtocolService;
import com.yt.uniPlatform.service.transportprotocol.dto.TransportProtocolDTO;
import com.yt.uniPlatform.utils.BaseConvert;

/**
 * 
 * @author zhangjing 
 * date: 2019年2月22日 下午2:31:52
 */
@RestController
public class TransportProtocolServiceImpl extends AbstractServiceImpl implements TransportProtocolService {

	@Autowired
	private TransportProtocolMapper transportProtocolMapper;

	@Override
	public TransportProtocolDTO queryTransportProtocolByTransNumber(@RequestParam("transNumber") String transNumber) {
		return returnDTO(transportProtocolMapper.queryTransportProtocolByTransNumber(transNumber),
				TransportProtocolDTO.class);
	}

	@Override
	public PageInfo<TransportProtocolDTO> queryTransportProtocolListByCondition(
			@RequestBody TransportProtocolDTO transportProtocolDTO) {

		pageAndOrder(transportProtocolDTO);

		return returnPageInfo(
				transportProtocolMapper.queryTransportProtocolByCondition(
						BaseConvert.convert(transportProtocolDTO, TransportProtocolDO.class)),
				TransportProtocolDTO.class);
	}

	@Override
	public TransportProtocolDTO queryTransportProtocolById(@RequestParam("id") String id) {

		return returnDTO(transportProtocolMapper.queryTransportProtocolById(id), TransportProtocolDTO.class);
	}

}
