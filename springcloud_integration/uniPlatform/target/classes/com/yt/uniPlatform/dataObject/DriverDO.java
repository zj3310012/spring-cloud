package com.yt.uniPlatform.dataObject;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author zhangjing
 * date: 2019年4月2日 下午2:37:58
 */
public class DriverDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8477522663828461571L;

	// ID
	private int id;
	// 用户表ID
	private int fkUserId;
	// 车牌号
	private String plate;
	// 创建时间
	private Date createAt;
	// 承运商外键
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
