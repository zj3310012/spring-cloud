package com.yt.dataExchange.web.model;

import java.util.Date;

import com.yt.coreapi.utils.Page;

public class User extends Page {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7952104614776431393L;
	// ID
	private int id;
	// 密码
	private String hash;
	// 邮箱
	private String email;
	// 移动电话号码
	private String mobile;
	// 座机号码
	private String telephone;
	// 角色
	private int roleType;
	// 激活状态
	private int active;
	// 创建时间
	private Date createTime;
	// 用户名
	private String username;
	// 全名
	private String fullname;
	// 头像地址
	private String photoUrl;
	// 中文全名
	private String zhName;
	// 用户工号
	private String userNo;

	private String registractionId;
	// 转运中心编码
	private String fkLocationCode;
	// 部门编号
	private String fkDeptId;
	// 更新时间
	private Date updateTime;
	// 注册来源
	private int source;
	// 用户类型
	private int userType;
	// 地址
	private String address;
	// 账户类型
	private int comType;
	// 注销/禁用标记
	private int deleteFlag;
	// 账户禁用原因
	private String reason;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getRoleType() {
		return roleType;
	}

	public void setRoleType(int roleType) {
		this.roleType = roleType;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getZhName() {
		return zhName;
	}

	public void setZhName(String zhName) {
		this.zhName = zhName;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getRegistractionId() {
		return registractionId;
	}

	public void setRegistractionId(String registractionId) {
		this.registractionId = registractionId;
	}

	public String getFkLocationCode() {
		return fkLocationCode;
	}

	public void setFkLocationCode(String fkLocationCode) {
		this.fkLocationCode = fkLocationCode;
	}

	public String getFkDeptId() {
		return fkDeptId;
	}

	public void setFkDeptId(String fkDeptId) {
		this.fkDeptId = fkDeptId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getComType() {
		return comType;
	}

	public void setComType(int comType) {
		this.comType = comType;
	}

	public int getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
