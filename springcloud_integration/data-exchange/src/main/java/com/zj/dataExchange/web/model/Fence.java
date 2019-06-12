package com.zj.dataExchange.web.model;

import java.util.Date;

public class Fence extends Page {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5844227943007274100L;

	// ID
	private int id;
	// 围栏ID
	private String fenceId;
	// 围栏名称
	private String fenceName;
	// 围栏半径
	private int radius;
	// 创建时间
	private Date createAt;
	// 第三方围栏触发时间
	private Date thTriggerAt;
	// 围栏触发时间
	private Date triggerAt;
	// 围栏状态
	private int status;
	// 承运单号
	private String fkTransNumber;
	// 围栏对应转运中心编码
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
