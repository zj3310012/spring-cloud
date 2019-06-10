package com.zj.dataExchange.service.bdmorganization.dto;

import java.util.Date;

import com.zj.dataExchange.web.model.Page;

/**
 * 组织
 * 
 * @author zhangjing
 * date: 2019年3月13日 上午11:23:58
 */
public class BdmOrganizationDTO extends Page{

	/**
	 * 
	 */
	private static final long serialVersionUID = -850452133409109744L;
	
	//ID
	private int id;
	//组织名称
	private String name;
	//组织编号
	private String orgNumber;
	//父组织ID
	private int parentOrgId;
	//组织类型
	private int orgType;
	//运营方式
	private int directType;
	//企业经营方式
	private int businessType;
	//组织职责（描述）
	private String dutyDesc;
	//所属区域ID
	private int regionId;
	//所属街道
	private String street;
	//详细地址
	private String address;
	//经理名称
	private String managerName;
	//经理电话
	private String managerMobile;
	//备注
	private String note;
	//组织状态
	private int status;
	//创建时间
	private Date createAt;
	//创建人ID
	private String creator;
	//更新时间
	private Date updateAt;
	//更新人ID
	private String updater;
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
	public String getOrgNumber() {
		return orgNumber;
	}
	public void setOrgNumber(String orgNumber) {
		this.orgNumber = orgNumber;
	}
	public int getParentOrgId() {
		return parentOrgId;
	}
	public void setParentOrgId(int parentOrgId) {
		this.parentOrgId = parentOrgId;
	}
	public int getOrgType() {
		return orgType;
	}
	public void setOrgType(int orgType) {
		this.orgType = orgType;
	}
	public int getDirectType() {
		return directType;
	}
	public void setDirectType(int directType) {
		this.directType = directType;
	}
	public int getBusinessType() {
		return businessType;
	}
	public void setBusinessType(int businessType) {
		this.businessType = businessType;
	}
	public String getDutyDesc() {
		return dutyDesc;
	}
	public void setDutyDesc(String dutyDesc) {
		this.dutyDesc = dutyDesc;
	}
	public int getRegionId() {
		return regionId;
	}
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerMobile() {
		return managerMobile;
	}
	public void setManagerMobile(String managerMobile) {
		this.managerMobile = managerMobile;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public String getUpdater() {
		return updater;
	}
	public void setUpdater(String updater) {
		this.updater = updater;
	}
	
}
