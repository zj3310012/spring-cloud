package com.yt.dataExchange.web.vo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;

/**
 * 承运商资质审核结果
 * 
 * @author zhangjing
 * date: 2019年3月4日 下午6:14:36
 */
@ApiModel("承运商资质审核结果对象")
public class CommitsVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8566338206391825301L;

	//ID
	private int id;
	//审核说明
	private String reason;
	//创建时间
	private Date createTime;
	//审核状态
	private String status;
	//星标
	private int star;
	//承运商ID
	private int shipperId;
	//判断是否有权限
	private int tempApproved;
	//用户id
	private String managerId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public int getShipperId() {
		return shipperId;
	}

	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}

	public int getTempApproved() {
		return tempApproved;
	}

	public void setTempApproved(int tempApproved) {
		this.tempApproved = tempApproved;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	
	
}