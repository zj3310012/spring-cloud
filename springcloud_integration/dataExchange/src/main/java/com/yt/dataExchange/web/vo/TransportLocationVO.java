package com.yt.dataExchange.web.vo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;

/**
 * 场地
 * 
 * @author zhangjing
 * date: 2019年2月27日 下午5:49:59
 */
@ApiModel("场地对象")
public class TransportLocationVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6146175514970535547L;
	//ID
	private int id;
	//转运中心名称
	private String name;
	//转运中心地址
	private String address;
	//转运中心街道地址
	private String roadAddress;
	//围栏半径-大
	private int radiusB;
	//围栏半径-小
	private int radiusS;
	//经度
	private int lon;
	//纬度
	private int lat;
	//所属国家编号
	private String countryCode;
	//所属国家名称
	private String countryNane;
	//所属省份编号
	private String provinceCode;
	//所属省份名称
	private String provinceName;
	//所属城市编号
	private String cityCode;
	//所属城市名称
	private String cityName;
	//所属区域编号
	private String areaCode;
	//所属区域名称
	private String areaName;
	
	private String fkProvinceCode;
	
	private String fkCityCode;
	
	private String fkAreaCode;
	//转运中心编码
	private String code;
	//转运中心子编码
	private String childCode;
	//转运中心联系人
	private String contact;
	//联系人电话
	private String telephone;
	//创建时间
	private Date createTime;
	//更新时间
	private Date updateTime;
	//中心简称
	private String shortName;
	//场地名称
	private String yardName;
	//场地简称
	private String yardShortName;
	//组织ID
	private int orgId;
	//场地状态
	private int status;
	//备注
	private String reason;
	//场地描述
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRoadAddress() {
		return roadAddress;
	}

	public void setRoadAddress(String roadAddress) {
		this.roadAddress = roadAddress;
	}

	public int getRadiusB() {
		return radiusB;
	}

	public void setRadiusB(int radiusB) {
		this.radiusB = radiusB;
	}

	public int getRadiusS() {
		return radiusS;
	}

	public void setRadiusS(int radiusS) {
		this.radiusS = radiusS;
	}

	public int getLon() {
		return lon;
	}

	public void setLon(int lon) {
		this.lon = lon;
	}

	public int getLat() {
		return lat;
	}

	public void setLat(int lat) {
		this.lat = lat;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryNane() {
		return countryNane;
	}

	public void setCountryNane(String countryNane) {
		this.countryNane = countryNane;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getFkProvinceCode() {
		return fkProvinceCode;
	}

	public void setFkProvinceCode(String fkProvinceCode) {
		this.fkProvinceCode = fkProvinceCode;
	}

	public String getFkCityCode() {
		return fkCityCode;
	}

	public void setFkCityCode(String fkCityCode) {
		this.fkCityCode = fkCityCode;
	}

	public String getFkAreaCode() {
		return fkAreaCode;
	}

	public void setFkAreaCode(String fkAreaCode) {
		this.fkAreaCode = fkAreaCode;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getChildCode() {
		return childCode;
	}

	public void setChildCode(String childCode) {
		this.childCode = childCode;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getYardName() {
		return yardName;
	}

	public void setYardName(String yardName) {
		this.yardName = yardName;
	}
	
	public String getYardShortName() {
		return yardShortName;
	}

	public void setYardShortName(String yardShortName) {
		this.yardShortName = yardShortName;
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
