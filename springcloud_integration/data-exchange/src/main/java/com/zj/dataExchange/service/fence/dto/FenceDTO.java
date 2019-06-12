package com.zj.dataExchange.service.fence.dto;

import java.util.Date;

import com.zj.dataExchange.web.model.Page;

/**
 * 围栏
 * 
 * @author zhangjing
 * date: 2019年3月13日 上午11:43:45
 */
public class FenceDTO extends Page{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7090185670291133274L;
	
	//ID
	private int id;
	//围栏ID
	private String fenceId;
	//围栏名称
	private String fenceName;
	//围栏半径
	private int radius;
	//创建时间
	private Date createAt;
	//第三方围栏触发时间
	private Date thTriggerAt;
	//围栏触发时间
	private Date triggerAt;
	//围栏状态
	private int status;
	//承运单号
	private String fkTransNumber;
	//围栏对应转运中心编码
	private String fkLocationCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFenceId() {
		return fenceId;
	}

	public void setFenceId(String fenceId) {
		this.fenceId = fenceId;
	}

	public String getFenceName() {
		return fenceName;
	}

	public void setFenceName(String fenceName) {
		this.fenceName = fenceName;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getThTriggerAt() {
		return thTriggerAt;
	}

	public void setThTriggerAt(Date thTriggerAt) {
		this.thTriggerAt = thTriggerAt;
	}

	public Date getTriggerAt() {
		return triggerAt;
	}

	public void setTriggerAt(Date triggerAt) {
		this.triggerAt = triggerAt;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getFkTransNumber() {
		return fkTransNumber;
	}

	public void setFkTransNumber(String fkTransNumber) {
		this.fkTransNumber = fkTransNumber;
	}

	public String getFkLocationCode() {
		return fkLocationCode;
	}

	public void setFkLocationCode(String fkLocationCode) {
		this.fkLocationCode = fkLocationCode;
	}
}
