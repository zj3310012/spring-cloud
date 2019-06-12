package com.zj.dataExchange.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.netflix.hystrix.exception.HystrixTimeoutException;
import com.zj.dataExchange.enums.ResponseStatus;
import com.zj.dataExchange.utils.BaseConvert;
import com.zj.dataExchange.utils.Page;
import com.zj.dataExchange.utils.ReturnData;

import feign.RetryableException;

/**
 * 统一返回处理
 * 
 * @author zhangjing
 * date: 2019年3月18日 上午10:12:49
 */
public abstract class AbstractServiceImpl {

	private static final Logger LOGGER = LoggerFactory.getLogger(AbstractServiceImpl.class);
	
	public <DTO,VO> ReturnData returnList(PageInfo<DTO> pageInfo, Class<VO> clazzVO) {
		Page<VO> page = null;
		if(pageInfo != null && !CollectionUtils.isEmpty(pageInfo.getList())) {
			page = new Page<VO>(pageInfo.getPageNum(), pageInfo.getSize());
			page.setCount(pageInfo.getTotal());
			page.setTotalPages(pageInfo.getPages());
			page.setList(BaseConvert.convert(pageInfo.getList(), clazzVO));
			return new ReturnData(page);
		}
		return null;
	}
	
	public <DTO,VO> ReturnData returnDate(DTO dto, Class<VO> clazzVO) {
		if(dto != null) {
			return new ReturnData(BaseConvert.convert(dto, clazzVO));
		}
		return null;
	}
	
	protected ReturnData invokeCallback(Object obj,Throwable e,String method) {
		if(HystrixTimeoutException.class.isAssignableFrom(e.getClass())|| RetryableException.class.isAssignableFrom(e.getClass())) {
			LOGGER.error("连接统一平台(uniPlatform)超时,接口:" +method+ ",请求参数:"+JSON.toJSONString(obj), e);
			return new ReturnData(ResponseStatus.CONNECTION_TIMED_OUT.getCode(), "",
					ResponseStatus.CONNECTION_TIMED_OUT.getMsg());
		}
		else {
			LOGGER.error("统一平台(uniPlatform)系统错误,接口:" +method+ ",请求参数:"+JSON.toJSONString(obj), e);
			return new ReturnData(ResponseStatus.INTERNAL_SERVER_ERROR.getCode(), "",
					ResponseStatus.INTERNAL_SERVER_ERROR.getMsg());
		}
	}
}
