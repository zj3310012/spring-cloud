package com.zj.dataExchange.web.model;

import java.util.Date;

import com.yt.coreapi.utils.Page;

public class TransportProtocol extends Page {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2453237587775123719L;

	// ID
	private int id;
	// 运单号
	private String transNumber;
	// 预计开始时间
	private String startTime;
	// 预计到达时间
	private String endTime;
	// 结算方式
	private String settlementMode;
	// 装载率
	private double driverFreight;
	// 备注
	private String note;
	// 车牌号
	private String plate;
	// 运单创建日期
	private Date createDate;
	// 运单创建时间
	private Date createTime;
	// 司机
	private int fkDriverId;
	// 终点地编码
	private String fkToLocationCode;
	// 起始地编码
	private String fkAtLocationCode;
	// 外键，操作人
	private int fkOperatorId;
	// 运单状态
	private int status;
	// 运单状态改变时间
	private Date statusTime;
	// 运单数据更新时间
	private Date updateTime;
	// 中转状态
	private int relayStatus;
	// 是否在途
	private int isOnWay;
	// 是否临时车
	private int isTempTruck;
	// 是否加班车
	private int isOverTime;
	// 线路编号
	private String lineNo;
	// 承运商名称
	private String carrierName;
	// 是否一车往返
	private int isLink;
	// 关联运单号
	private String link;
	//
	private String vehicleType;
	// 车辆运行方式
	private int runMode;
	// 票据
	private String voucher;
	// 车辆
	private int fkTruckId;
	// 挂厢
	private String trailerHead;
	// 线路属性
	private String lineProperty;
	// 承运商编号
	private String carrierCode;
	// 运单类型
	private String createType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTransNumber() {
		return transNumber;
	}

	public void setTransNumber(String transNumber) {
		this.transNumber = transNumber;
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

	public String getSettlementMode() {
		return settlementMode;
	}

	public void setSettlementMode(String settlementMode) {
		this.settlementMode = settlementMode;
	}

	public double getDriverFreight() {
		return driverFreight;
	}

	public void setDriverFreight(double driverFreight) {
		this.driverFreight = driverFreight;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getFkDriverId() {
		return fkDriverId;
	}

	public void setFkDriverId(int fkDriverId) {
		this.fkDriverId = fkDriverId;
	}

	public String getFkToLocationCode() {
		return fkToLocationCode;
	}

	public void setFkToLocationCode(String fkToLocationCode) {
		this.fkToLocationCode = fkToLocationCode;
	}

	public String getFkAtLocationCode() {
		return fkAtLocationCode;
	}

	public void setFkAtLocationCode(String fkAtLocationCode) {
		this.fkAtLocationCode = fkAtLocationCode;
	}

	public int getFkOperatorId() {
		return fkOperatorId;
	}

	public void setFkOperatorId(int fkOperatorId) {
		this.fkOperatorId = fkOperatorId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getStatusTime() {
		return statusTime;
	}

	public void setStatusTime(Date statusTime) {
		this.statusTime = statusTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getRelayStatus() {
		return relayStatus;
	}

	public void setRelayStatus(int relayStatus) {
		this.relayStatus = relayStatus;
	}

	public int getIsOnWay() {
		return isOnWay;
	}

	public void setIsOnWay(int isOnWay) {
		this.isOnWay = isOnWay;
	}

	public int getIsTempTruck() {
		return isTempTruck;
	}

	public void setIsTempTruck(int isTempTruck) {
		this.isTempTruck = isTempTruck;
	}

	public int getIsOverTime() {
		return isOverTime;
	}

	public void setIsOverTime(int isOverTime) {
		this.isOverTime = isOverTime;
	}

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public int getIsLink() {
		return isLink;
	}

	public void setIsLink(int isLink) {
		this.isLink = isLink;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getRunMode() {
		return runMode;
	}

	public void setRunMode(int runMode) {
		this.runMode = runMode;
	}

	public String getVoucher() {
		return voucher;
	}

	public void setVoucher(String voucher) {
		this.voucher = voucher;
	}

	public int getFkTruckId() {
		return fkTruckId;
	}

	public void setFkTruckId(int fkTruckId) {
		this.fkTruckId = fkTruckId;
	}

	public String getTrailerHead() {
		return trailerHead;
	}

	public void setTrailerHead(String trailerHead) {
		this.trailerHead = trailerHead;
	}

	public String getLineProperty() {
		return lineProperty;
	}

	public void setLineProperty(String lineProperty) {
		this.lineProperty = lineProperty;
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public String getCreateType() {
		return createType;
	}

	public void setCreateType(String createType) {
		this.createType = createType;
	}
}
