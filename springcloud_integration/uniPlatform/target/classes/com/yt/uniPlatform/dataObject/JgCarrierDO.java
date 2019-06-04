package com.yt.uniPlatform.dataObject;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author zhangjing
 * date: 2019年4月2日 下午2:38:15
 */
public class JgCarrierDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6768644374376858144L;

	// ID
	private int id;
	// 金刚承运商id
	private String carrierId;
	// 承运商名称
	private String name;
	// 承运商编码
	private String code;
	// 承运商地址
	private String address;
	// 承运商联系电话
	private String telephoneNumber;
	// 承运商传真号码
	private String faxNo;
	// 所属公司
	private String affiliatedCompany;
	// 所属公司名称
	private String affiliatedCompanyName;
	// 承运商状态
	private String status;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date updateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getFaxNo() {
		return faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public String getAffiliatedCompany() {
		return affiliatedCompany;
	}

	public void setAffiliatedCompany(String affiliatedCompany) {
		this.affiliatedCompany = affiliatedCompany;
	}

	public String getAffiliatedCompanyName() {
		return affiliatedCompanyName;
	}

	public void setAffiliatedCompanyName(String affiliatedCompanyName) {
		this.affiliatedCompanyName = affiliatedCompanyName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

}
