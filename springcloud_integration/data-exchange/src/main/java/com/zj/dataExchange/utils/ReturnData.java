package com.zj.dataExchange.utils;

import java.io.Serializable;

import com.zj.dataExchange.enums.ResponseStatus;

/**
 * 返回给前台的响应消息
 */
public class ReturnData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8143594278986430172L;
	private int code;
	private Object data;
	private String msg;

	public ReturnData(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public ReturnData(int code, Object data, String msg) {
		this.code = code;
		this.data = data;
		this.msg = msg;
	}

	public ReturnData(Object data) {
		this.code = ResponseStatus.OK.getCode();
		this.data = data;
		this.msg = ResponseStatus.OK.getMsg();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
