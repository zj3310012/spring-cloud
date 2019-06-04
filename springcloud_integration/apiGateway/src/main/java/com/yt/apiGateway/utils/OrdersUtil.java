package com.yt.apiGateway.utils;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * 
 * @author zhangjing
 * date: 2019年3月27日 上午10:19:09
 */
public class OrdersUtil {

	/**
	 * 对map中的元素按key字母升序排序拼接成字符串，key1value1key2value2......
	 * 
	 * @param paramMap
	 * @return
	 */
	public static String sortKeyValue(Map<String, Object> paramMap)
	{
		StringBuffer buf = new StringBuffer();
		Map<String, Object> orderMap = new TreeMap<String, Object>();
		orderMap.putAll(paramMap);
		Iterator<String> iterator = orderMap.keySet().iterator();
		while (iterator.hasNext())
		{
			String key = iterator.next();
			String value = String.valueOf(orderMap.get(key));
			if ((key != null) && (value.length() != 0))
				buf.append(key + value);
		}
		return buf.toString();
	}
}
