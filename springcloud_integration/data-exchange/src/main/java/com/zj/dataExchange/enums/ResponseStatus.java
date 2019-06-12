package com.zj.dataExchange.enums;

public enum ResponseStatus {

	OK(200, "执行成功"),
    INTERNAL_SERVER_ERROR(500, "服务器错误"),
	CONNECTION_TIMED_OUT(409, "连接超时");
	private ResponseStatus(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	private int code;
	
	private String msg;

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
	
    public static ResponseStatus getReturnDataByCode(int code) {
    	for(ResponseStatus responseStatus : ResponseStatus.values()) {
    		if(responseStatus.getCode() == code)
    			return responseStatus;
    	}
    	return null;
    }
	
}
