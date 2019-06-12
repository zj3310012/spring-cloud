package com.zj.dataExchange.web.vo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;

/**
 * 承运商资质
 * 
 * @author zhangjing
 * date: 2019年3月1日 下午4:13:08
 */
@ApiModel("承运商资质对象")
public class ShippersVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1573406790015788896L;

	//ID
	private int id;
	//公司全称
	private String comName;
	//公司简介
	private String comAbout;
	//公司优势区域
	private String betterArea;
	//营业执照注册号
	private String bussId;
	//营业执照照片
	private String urlBussId;
	//注册资本
	private String bussMoney;
	//组织机构代码
	private String entpId;
	//组织结构代码证件照片url
	private String urlEntpId;
	//道路运输许可证号
	private String transId;
	//道路许可证照片url
	private String urlTransId;
	//物流责任险保单照片url
	private String urlInsurance;
	//企业法人/负责人姓名
	private String legalpName;
	//籍贯
	private String legalpHome;
	//身份证
	private String legalpCid;
	//联系方式
	private String legalpPhone;
	//邮箱
	private String legalpEmail;
	//法人身份证照正面
	private String urlFcid;
	//法人身份证照反面
	private String urlBcid;
	//税务报表或审计报告
	private String taxId;
	//税务报表
	private String urlTax;
	//银行账号
	private String bAccount;
	//银行账号名称
	private String bCom;
	//开户银行
	private String bBank;
	//开户许可证照片
	private String urlBPassport;
	//一般纳税人证明照片
	private String urlBTaxer;
	//利润表的地址
	private String urlProfit;
	//年度审计报告文件地址
	private String urlAuditReport;
	//增值税地址
	private String urlAddTax;
	//资产地址
	private String urlProperty;
	//项目联络人姓名
	private String contactName;
	//身份证号码
	private String contactCid;
	//籍贯
	private String contactHome;
	//联系电话
	private String contactPhone;
	//邮箱
	private String contactEmail;
	//职位
	private String contactPosition;
	//部门
	private String contactDepart;
	//创建时间
	private Date createTime;
	//状态
	private int status;
	//用户id
	private int userId;
	//承运商编码
	private String comNo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getComAbout() {
		return comAbout;
	}

	public void setComAbout(String comAbout) {
		this.comAbout = comAbout;
	}

	public String getBetterArea() {
		return betterArea;
	}

	public void setBetterArea(String betterArea) {
		this.betterArea = betterArea;
	}

	public String getBussId() {
		return bussId;
	}

	public void setBussId(String bussId) {
		this.bussId = bussId;
	}

	public String getUrlBussId() {
		return urlBussId;
	}

	public void setUrlBussId(String urlBussId) {
		this.urlBussId = urlBussId;
	}

	public String getBussMoney() {
		return bussMoney;
	}

	public void setBussMoney(String bussMoney) {
		this.bussMoney = bussMoney;
	}

	public String getEntpId() {
		return entpId;
	}

	public void setEntpId(String entpId) {
		this.entpId = entpId;
	}

	public String getUrlEntpId() {
		return urlEntpId;
	}

	public void setUrlEntpId(String urlEntpId) {
		this.urlEntpId = urlEntpId;
	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getUrlTransId() {
		return urlTransId;
	}

	public void setUrlTransId(String urlTransId) {
		this.urlTransId = urlTransId;
	}

	public String getUrlInsurance() {
		return urlInsurance;
	}

	public void setUrlInsurance(String urlInsurance) {
		this.urlInsurance = urlInsurance;
	}

	public String getLegalpName() {
		return legalpName;
	}

	public void setLegalpName(String legalpName) {
		this.legalpName = legalpName;
	}

	public String getLegalpHome() {
		return legalpHome;
	}

	public void setLegalpHome(String legalpHome) {
		this.legalpHome = legalpHome;
	}

	public String getLegalpCid() {
		return legalpCid;
	}

	public void setLegalpCid(String legalpCid) {
		this.legalpCid = legalpCid;
	}

	public String getLegalpPhone() {
		return legalpPhone;
	}

	public void setLegalpPhone(String legalpPhone) {
		this.legalpPhone = legalpPhone;
	}

	public String getLegalpEmail() {
		return legalpEmail;
	}

	public void setLegalpEmail(String legalpEmail) {
		this.legalpEmail = legalpEmail;
	}

	public String getUrlFcid() {
		return urlFcid;
	}

	public void setUrlFcid(String urlFcid) {
		this.urlFcid = urlFcid;
	}

	public String getUrlBcid() {
		return urlBcid;
	}

	public void setUrlBcid(String urlBcid) {
		this.urlBcid = urlBcid;
	}

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public String getUrlTax() {
		return urlTax;
	}

	public void setUrlTax(String urlTax) {
		this.urlTax = urlTax;
	}

	public String getbAccount() {
		return bAccount;
	}

	public void setbAccount(String bAccount) {
		this.bAccount = bAccount;
	}

	public String getbCom() {
		return bCom;
	}

	public void setbCom(String bCom) {
		this.bCom = bCom;
	}

	public String getbBank() {
		return bBank;
	}

	public void setbBank(String bBank) {
		this.bBank = bBank;
	}

	public String getUrlBPassport() {
		return urlBPassport;
	}

	public void setUrlBPassport(String urlBPassport) {
		this.urlBPassport = urlBPassport;
	}

	public String getUrlBTaxer() {
		return urlBTaxer;
	}

	public void setUrlBTaxer(String urlBTaxer) {
		this.urlBTaxer = urlBTaxer;
	}

	public String getUrlProfit() {
		return urlProfit;
	}

	public void setUrlProfit(String urlProfit) {
		this.urlProfit = urlProfit;
	}

	public String getUrlAuditReport() {
		return urlAuditReport;
	}

	public void setUrlAuditReport(String urlAuditReport) {
		this.urlAuditReport = urlAuditReport;
	}

	public String getUrlAddTax() {
		return urlAddTax;
	}

	public void setUrlAddTax(String urlAddTax) {
		this.urlAddTax = urlAddTax;
	}

	public String getUrlProperty() {
		return urlProperty;
	}

	public void setUrlProperty(String urlProperty) {
		this.urlProperty = urlProperty;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactCid() {
		return contactCid;
	}

	public void setContactCid(String contactCid) {
		this.contactCid = contactCid;
	}

	public String getContactHome() {
		return contactHome;
	}

	public void setContactHome(String contactHome) {
		this.contactHome = contactHome;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPosition() {
		return contactPosition;
	}

	public void setContactPosition(String contactPosition) {
		this.contactPosition = contactPosition;
	}

	public String getContactDepart() {
		return contactDepart;
	}

	public void setContactDepart(String contactDepart) {
		this.contactDepart = contactDepart;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getComNo() {
		return comNo;
	}

	public void setComNo(String comNo) {
		this.comNo = comNo;
	}
	
	
}
