package com.zj.uniPlatform.service;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zj.uniPlatform.utils.BaseConvert;
import com.zj.uniPlatform.utils.Page;

/**
 * 统一返回处理
 * 
 * @author zhangjing 
 * date: 2019年3月15日 下午3:20:06
 */
public abstract class AbstractServiceImpl {

	/**
	 * 
	 * @param d
	 * @param clazzDto
	 * @return
	 */
	public <DO, DTO> DTO returnDTO(DO d, Class<DTO> clazzDto) {
		return d != null ? BaseConvert.convert(d, clazzDto) : null;
	}

	/**
	 * 
	 * @param list
	 * @param clazzDto
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <DO, DTO> PageInfo<DTO> returnPageInfo(List<DO> list, Class<DTO> clazzDto) {
		if (!CollectionUtils.isEmpty(list)) {
			List<DTO> dataList = BaseConvert.convert(list, clazzDto);
			PageInfo<DO> pageInfoDO = new PageInfo<DO>(list);
			pageInfoDO.setList(null);
			PageInfo<DTO> pageInfoDTO = BaseConvert.convert(pageInfoDO, new PageInfo<DTO>().getClass());
			pageInfoDTO.setList(dataList);
			return pageInfoDTO;
		}
		return null;
	}

	/**
	 * 
	 * @param page
	 */
	public void pageAndOrder(Page page) {
		// 分页
		if (page.getCurrentPage() > 0 && page.getSize() > 0) {
			PageHelper.startPage(page.getCurrentPage(), page.getSize());
		}
		// 默认当前页为1，大小为10
		else {
			PageHelper.startPage(1, 10);
		}

		// 排序
		if (StringUtils.isNotBlank(page.getOrderBy()) && StringUtils.isNotBlank(page.getOrderWay())) {
			PageHelper.orderBy(page.getOrderBy() + " " + page.getOrderWay());
		}
	}
}
