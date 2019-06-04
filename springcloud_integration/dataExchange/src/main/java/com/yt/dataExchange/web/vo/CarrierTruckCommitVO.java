package com.yt.dataExchange.web.vo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;

/**
 * 车辆审核
 * 
 * @author zhangjing
 * date: 2019年3月4日 上午11:15:13
 */
@ApiModel("车辆审核对象")
public class CarrierTruckCommitVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4254857655555308775L;
	
	//ID
	private int id;
	//是否是黑名单
	private int isBlack;
	//是否为临时车
	private int isTempTruck;
	//采购部审核结果
	private int cgCommitResult;
	//汽运部审核结果
	private int qyCommitResult;
	//是否上线
	private int isOnline;
	//是否曾入过网
	private int isNet;
	//承运商ID
	private int fkCarrierId;
	//车牌号码
	private String fkTruckPlate;
	//车型
	private double vehicleType;
	//方位
	private double volumn;
	//实测车型
	private double realVehicleType;
	//实测方位
	private double realVolumn;
	//绑定班次线路信息
	private String lineProperty;
	//是否禁用
	private int isForbidden;
	//创建时间
	private Date createTime;
	//更新时间
	private Date updateTime;
	//是否行驶中
	private int isOnWay;
	//审核人姓名
	private String operator;
	//审核人ID
	private int operatorId;
	//审核意见
	private String reason;
	//承运商名称
	private String shipperName;
	//是否申请成为正式车
	private int isWantFormal;
	//实测车长
	private double realLong;
	//实测车宽
	private double realWidth;
	//实测车高
	private double realHeight;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIsBlack() {
		return isBlack;
	}

	public void setIsBlack(int isBlack) {
		this.isBlack = isBlack;
	}

	public int getIsTempTruck() {
		return isTempTruck;
	}

	public void setIsTempTruck(int isTempTruck) {
		this.isTempTruck = isTempTruck;
	}

	public int getCgCommitResult() {
		return cgCommitResult;
	}

	public void setCgCommitResult(int cgCommitResult) {
		this.cgCommitResult = cgCommitResult;
	}

	public int getQyCommitResult() {
		return qyCommitResult;
	}

	public void setQyCommitResult(int qyCommitResult) {
		this.qyCommitResult = qyCommitResult;
	}

	public int getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(int isOnline) {
		this.isOnline = isOnline;
	}

	public int getIsNet() {
		return isNet;
	}

	public void setIsNet(int isNet) {
		this.isNet = isNet;
	}

	public int getFkCarrierId() {
		return fkCarrierId;
	}

	public void setFkCarrierId(int fkCarrierId) {
		this.fkCarrierId = fkCarrierId;
	}
	
	public String getFkTruckPlate() {
		return fkTruckPlate;
	}

	public void setFkTruckPlate(String fkTruckPlate) {
		this.fkTruckPlate = fkTruckPlate;
	}

	public double getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(double vehicleType) {
		this.vehicleType = vehicleType;
	}

	public double getVolumn() {
		return volumn;
	}

	public void setVolumn(double volumn) {
		this.volumn = volumn;
	}

	public double getRealVehicleType() {
		return realVehicleType;
	}

	public void setRealVehicleType(double realVehicleType) {
		this.realVehicleType = realVehicleType;
	}

	public double getRealVolumn() {
		return realVolumn;
	}

	public void setRealVolumn(double realVolumn) {
		this.realVolumn = realVolumn;
	}

	public String getLineProperty() {
		return lineProperty;
	}

	public void setLineProperty(String lineProperty) {
		this.lineProperty = lineProperty;
	}

	public int getIsForbidden() {
		return isForbidden;
	}

	public void setIsForbidden(int isForbidden) {
		this.isForbidden = isForbidden;
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

	public int getIsOnWay() {
		return isOnWay;
	}

	public void setIsOnWay(int isOnWay) {
		this.isOnWay = isOnWay;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public int getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getShipperName() {
		return shipperName;
	}

	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}

	public int getIsWantFormal() {
		return isWantFormal;
	}

	public void setIsWantFormal(int isWantFormal) {
		this.isWantFormal = isWantFormal;
	}

	public double getRealLong() {
		return realLong;
	}

	public void setRealLong(double realLong) {
		this.realLong = realLong;
	}

	public double getRealWidth() {
		return realWidth;
	}

	public void setRealWidth(double realWidth) {
		this.realWidth = realWidth;
	}

	public double getRealHeight() {
		return realHeight;
	}

	public void setRealHeight(double realHeight) {
		this.realHeight = realHeight;
	}

}
