package com.yt.uniPlatform.dataObject;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author zhangjing
 * date: 2019年4月2日 下午2:41:29
 */
public class LineSectionDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6014929124970279707L;
	// ID
	private int id;
	// 路段编码
	private String code;
	// 路段名称
	private String name;
	// 路段别名
	private String alias;
	// 起始地编码
	private String startPointCode;
	// 起始地名称
	private String startPointName;
	// 目的地编码
	private String endPointCode;
	// 目的地名称
	private String endPointName;
	// 运行速度
	private String velocity;
	// 运行里程
	private String distance;
	// 运行时长
	private int takeTime;
	// 运输方式
	private int transType;
	// 路段状态
	private int status;
	// 审核状态
	private int verify;
	// 数据性质
	private int dataType;
	// 创建人
	private String creator;

	private Date updateTime;

	private Date createTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getStartPointCode() {
		return startPointCode;
	}

	public void setStartPointCode(String startPointCode) {
		this.startPointCode = startPointCode;
	}

	public String getStartPointName() {
		return startPointName;
	}

	public void setStartPointName(String startPointName) {
		this.startPointName = startPointName;
	}

	public String getEndPointCode() {
		return endPointCode;
	}

	public void setEndPointCode(String endPointCode) {
		this.endPointCode = endPointCode;
	}

	public String getEndPointName() {
		return endPointName;
	}

	public void setEndPointName(String endPointName) {
		this.endPointName = endPointName;
	}

	public String getVelocity() {
		return velocity;
	}

	public void setVelocity(String velocity) {
		this.velocity = velocity;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public int getTakeTime() {
		return takeTime;
	}

	public void setTakeTime(int takeTime) {
		this.takeTime = takeTime;
	}

	public int getTransType() {
		return transType;
	}

	public void setTransType(int transType) {
		this.transType = transType;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getVerify() {
		return verify;
	}

	public void setVerify(int verify) {
		this.verify = verify;
	}

	public int getDataType() {
		return dataType;
	}

	public void setDataType(int dataType) {
		this.dataType = dataType;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
