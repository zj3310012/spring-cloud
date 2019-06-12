package com.yt.uniPlatform.service.linesection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yt.uniPlatform.service.linesection.dto.LineSectionDTO;

@RequestMapping("/linesection")
public interface LineSectionSerivce {

	/**
	 * 根据id查询路段
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/querylinesectionbyid", method = RequestMethod.GET)
	public LineSectionDTO queryDriverById(@RequestParam("id") String id);
}
