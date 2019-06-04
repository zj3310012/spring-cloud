package com.zj.apiGateway.utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.zj.apiGateway.dataObject.UserDO;

/**
 * 
 * @author zhangjing
 * date: 2019年3月28日 上午11:15:22
 */
public class LocalMapUtil {

	//支持hystrix线程隔离
	public static final ThreadLocal<String> threadLocal = new InheritableThreadLocal<String>();
	
	//用户签名秘钥、加密密码等信息缓存
	public static final Map<String,UserDO> userInfo =  new ConcurrentHashMap<String,UserDO>();
	
}
