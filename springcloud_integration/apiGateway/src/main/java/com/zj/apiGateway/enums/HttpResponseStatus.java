package com.zj.apiGateway.enums;

/**
 * 
 * @author zhangjing
 * date: 2019年4月1日 下午4:05:57
 */
public enum HttpResponseStatus {

	OK(200, "执行成功"),
	ILLEGAL_CHARACTER(1001,"有非法字符"),
	PARAMETER_DECRYPTION_EXCEPTION(1002,"请求参数解密异常"),
	SIGNATURE_VERIFICATION_FAILED(1003,"签名验证失败"),
	SIGNATURE_VERIFICATION_EXCEPTION(1004,"签名验证异常"),
	USER_INFORMATION_MISSING(1005,"用户信息不存在"),
	USER_CODE_UNAVAILABLE(1006,"该用户账号已被禁用"),
	REQUEST_PARAMETER_MISSING(1007,"请求参数缺失"),
	SECRET_KEY_MISSING(1008,"秘钥缺失"),
	NO_INFORMATION_QUERY(1009,"未查询到信息"),
	QUERY_EXCEPTION(1010,"查询发生异常"),
	DATA_INVALID(1011,"数据不合法"),
	SYSTEM_EXCEPTION(1012,"系统异常"),
	AUTHENTICATION_FAILURE(1013,"无权限访问"),
	SSO_SERVICE_EXCEPTION(1014,"SSO服务异常"),
	CONNECTION_EXCEPTION(1015,"服务连接异常"),
	REQUEST_ERROR(1016,"请求错误");
	
	private int code;
	
	private Object desc;
	
	private HttpResponseStatus(int code, String desc) {
		this.code = code;
		this.desc = desc;
	} 
	
    public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getDesc() {
		return desc;
	}

	public void setDesc(Object desc) {
		this.desc = desc;
	}

	public static HttpResponseStatus getReturnDataByCode(int code) {
    	for(HttpResponseStatus httpRequestStatus : HttpResponseStatus.values()) {
    		if(httpRequestStatus.getCode() == code)
    			return httpRequestStatus;
    	}
    	return null;
    }
}
