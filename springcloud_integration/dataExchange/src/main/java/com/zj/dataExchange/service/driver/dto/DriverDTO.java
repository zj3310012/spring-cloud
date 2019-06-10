package com.zj.dataExchange.service.driver.dto;

import java.util.Date;

import com.zj.dataExchange.web.model.Page;

/**
 * 司机
 * 
 * @author zhangjing
 * date: 2019年3月13日 下午1:34:51
 */
public class DriverDTO extends Page{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1286900145173158599L;
	
	//ID
	private int id;
	//用户表ID
	private int fkUserId;
	//车牌号
	private String plate;
	//创建时间
	private Date createAt;
	//承运商外键
	private int fkCarrierId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFkUserId() {
		return fkUserId;
	}

	public void setFkUserId(int fkUserId) {
		this.fkUserId = fkUserId;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public int getFkCarrierId() {
		return fkCarrierId;
	}

	public void setFkCarrierId(int fkCarrierId) {
		this.fkCarrierId = fkCarrierId;
	}
}
