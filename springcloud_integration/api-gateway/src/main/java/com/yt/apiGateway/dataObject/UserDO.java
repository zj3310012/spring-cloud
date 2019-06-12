package com.yt.apiGateway.dataObject;

import java.io.Serializable;

/**
 * 
 * @author zhangjing
 * date: 2019年4月1日 下午4:05:50
 */
public class UserDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6318102217900015291L;
	// ID
	private int id;
	// 签名公钥
	private String publicKey;
	// 签名私钥
	private String privateKey;
	// 加密秘钥
	private String symmetryKey;
	// 签名秘钥类型
	private String keyType;
	// 是否可用
	private int isUse;
	// uuid唯一编码
	private String userCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPublicKey() {
		return publicKey;
	}
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}
	public String getPrivateKey() {
		return privateKey;
	}
	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}
	public String getSymmetryKey() {
		return symmetryKey;
	}
	public void setSymmetryKey(String symmetryKey) {
		this.symmetryKey = symmetryKey;
	}
	public String getKeyType() {
		return keyType;
	}
	public void setKeyType(String keyType) {
		this.keyType = keyType;
	}
	public int getIsUse() {
		return isUse;
	}
	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	
}
