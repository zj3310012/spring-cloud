package com.yt.dataExchange.web.model;

import java.util.Date;

import com.yt.coreapi.utils.Page;

public class Line extends Page {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8861760467054403206L;
	// id
	private int id;
	// 线路编号
	private String lineNo;
	// 线路名称
	private String lineName;
	// 经停点
	private String transferCenterSet;
	// 起始点编号
	private String startOrgCode;
	// 起始点名称
	private String startOrgName;
	// 目的地编号
	private String endOrgCode;
	// 目的地名称
	private String endOrgName;
	// 频次编号
	private String lineFreguencyNo;
	// 频次名称
	private String lineFrequencyName;
	// 起始点发车时间
	private String startTime;
	// 目的地到达时间
	private String endTime;
	// 线路使用状态
	private int status;
	// 花费天数
	private int daySpan;
	// 总耗时
	private String fullTakeTime;
	// 总里程
	private String fullDistance;
	// 线路属性
	private String lineProperty;
	// 运输类型
	private String transType;
	// 线路状态
	private String lineStatus;
	// 频次类型
	private String freStatus;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date updateTime;
	// 线路类型
	private int lineType;

	private Date unlockTime;

	private Date lockTime;

	private String reason;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String getTransferCenterSet() {
		return transferCenterSet;
	}

	public void setTransferCenterSet(String transferCenterSet) {
		this.transferCenterSet = transferCenterSet;
	}

	public String getStartOrgCode() {
		return startOrgCode;
	}

	public void setStartOrgCode(String startOrgCode) {
		this.startOrgCode = startOrgCode;
	}

	public String getStartOrgName() {
		return startOrgName;
	}

	public void setStartOrgName(String startOrgName) {
		this.startOrgName = startOrgName;
	}

	public String getEndOrgCode() {
		return endOrgCode;
	}

	public void setEndOrgCode(String endOrgCode) {
		this.endOrgCode = endOrgCode;
	}

	public String getEndOrgName() {
		return endOrgName;
	}

	public void setEndOrgName(String endOrgName) {
		this.endOrgName = endOrgName;
	}

	public String getLineFreguencyNo() {
		return lineFreguencyNo;
	}

	public void setLineFreguencyNo(String lineFreguencyNo) {
		this.lineFreguencyNo = lineFreguencyNo;
	}

	public String getLineFrequencyName() {
		return lineFrequencyName;
	}

	public void setLineFrequencyName(String lineFrequencyName) {
		this.lineFrequencyName = lineFrequencyName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getDaySpan() {
		return daySpan;
	}

	public void setDaySpan(int daySpan) {
		this.daySpan = daySpan;
	}

	public String getFullTakeTime() {
		return fullTakeTime;
	}

	public void setFullTakeTime(String fullTakeTime) {
		this.fullTakeTime = fullTakeTime;
	}

	public String getFullDistance() {
		return fullDistance;
	}

	public void setFullDistance(String fullDistance) {
		this.fullDistance = fullDistance;
	}

	public String getLineProperty() {
		return lineProperty;
	}

	public void setLineProperty(String lineProperty) {
		this.lineProperty = lineProperty;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getLineStatus() {
		return lineStatus;
	}

	public void setLineStatus(String lineStatus) {
		this.lineStatus = lineStatus;
	}

	public String getFreStatus() {
		return freStatus;
	}

	public void setFreStatus(String freStatus) {
		this.freStatus = freStatus;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getLineType() {
		return lineType;
	}

	public void setLineType(int lineType) {
		this.lineType = lineType;
	}

	public Date getUnlockTime() {
		return unlockTime;
	}

	public void setUnlockTime(Date unlockTime) {
		this.unlockTime = unlockTime;
	}

	public Date getLockTime() {
		return lockTime;
	}

	public void setLockTime(Date lockTime) {
		this.lockTime = lockTime;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}
