package com.yt.uniPlatform.dataObject;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author zhangjing
 * date: 2019年4月2日 下午2:42:04
 */
public class TruckDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8646196385673380231L;

	// ID
	private int id;
	// 车牌号
	private String plate;
	// 车辆条形码
	private String vehicleNo;
	// 车长
	private double length;
	// 车宽
	private double wide;
	// 车高
	private double high;
	// 车重
	private double weight;
	// 车辆容积
	private double volume;
	// 车厢类型
	private int type;
	// 结算车型
	private String vehicleType;
	// 单双边
	private int runMode;
	// 二维码编号
	private String qrCode;
	// 线路属性
	private String lineProperty;
	// 是否为临时车
	private int isTempTruck;
	// 是否为可结算车型
	private int isForbidden;
	// 转运中心编码
	private String orgCode;
	// 承运商名称
	private String carrierName;
	// 承运商编码
	private String carrierCode;
	// 承运商ID
	private int fkCarrierId;
	// 车辆是否禁用
	private int ifValid;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date updateTime;
	// 是否挂车
	private int trailers;
	// 是否在途
	private int isOnWay;
	// 车辆类型
	private int plateType;
	// 车厢长度
	private String containerLength;
	// 车厢宽度
	private String containerWide;
	// 车厢高度
	private String containerHigh;
	// 车厢类型
	private String containerModel;

	private String lineType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWide() {
		return wide;
	}

	public void setWide(double wide) {
		this.wide = wide;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
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

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getLineProperty() {
		return lineProperty;
	}

	public void setLineProperty(String lineProperty) {
		this.lineProperty = lineProperty;
	}

	public int getIsTempTruck() {
		return isTempTruck;
	}

	public void setIsTempTruck(int isTempTruck) {
		this.isTempTruck = isTempTruck;
	}

	public int getIsForbidden() {
		return isForbidden;
	}

	public void setIsForbidden(int isForbidden) {
		this.isForbidden = isForbidden;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public int getFkCarrierId() {
		return fkCarrierId;
	}

	public void setFkCarrierId(int fkCarrierId) {
		this.fkCarrierId = fkCarrierId;
	}

	public int getIfValid() {
		return ifValid;
	}

	public void setIfValid(int ifValid) {
		this.ifValid = ifValid;
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

	public int getTrailers() {
		return trailers;
	}

	public void setTrailers(int trailers) {
		this.trailers = trailers;
	}

	public int getIsOnWay() {
		return isOnWay;
	}

	public void setIsOnWay(int isOnWay) {
		this.isOnWay = isOnWay;
	}

	public int getPlateType() {
		return plateType;
	}

	public void setPlateType(int plateType) {
		this.plateType = plateType;
	}

	public String getContainerLength() {
		return containerLength;
	}

	public void setContainerLength(String containerLength) {
		this.containerLength = containerLength;
	}

	public String getContainerWide() {
		return containerWide;
	}

	public void setContainerWide(String containerWide) {
		this.containerWide = containerWide;
	}

	public String getContainerHigh() {
		return containerHigh;
	}

	public void setContainerHigh(String containerHigh) {
		this.containerHigh = containerHigh;
	}

	public String getContainerModel() {
		return containerModel;
	}

	public void setContainerModel(String containerModel) {
		this.containerModel = containerModel;
	}

	public String getLineType() {
		return lineType;
	}

	public void setLineType(String lineType) {
		this.lineType = lineType;
	}
}
