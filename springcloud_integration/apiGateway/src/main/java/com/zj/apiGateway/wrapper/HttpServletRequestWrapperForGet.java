package com.zj.apiGateway.wrapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * 转换GET请求
 * 
 * @author zhangjing 
 * date: 2019年3月26日 下午2:08:30
 */
public class HttpServletRequestWrapperForGet extends HttpServletRequestWrapper {

	private Map<String, String[]> params = new ConcurrentHashMap<String, String[]>();
	
	public HttpServletRequestWrapperForGet(HttpServletRequest request) {
		super(request);
		params.putAll(request.getParameterMap());
	}

	// 覆盖（重写）父类获取字符流的方法
	@Override
	public BufferedReader getReader() throws IOException {
		return new BufferedReader(new InputStreamReader(getInputStream()));
	}

	// 重写getParameter，参数从当前类中的map获取
	@Override
	public String getParameter(String name) {
		String[] values = params.get(name);
		if (values == null || values.length == 0) {
			return null;
		}
		return values[0];
	}
	
	@Override
	public String[] getParameterValues(String name) {//同上
        return params.get(name);
    }
	

	public void setParams(Map<String , Object> otherParams) {
		params = new ConcurrentHashMap<String, String[]>();
		addAllParameters(otherParams); 
	}
	
	public Map<String, String[]> getParams(){
		return params;
	}
	
	/**
	 * 增加多个参数
	 * 
	 * @param otherParams
	 */
	public void addAllParameters(Map<String , Object>otherParams) {
        for(Map.Entry<String , Object> entry : otherParams.entrySet()) {
            addParameter(entry.getKey() , entry.getValue());
        }
    }
	
	/**
	 * 增加参数
	 * 
	 * @param name
	 * @param value
	 */
	public void addParameter(String name , Object value) {
        if(value != null) {
            if(value instanceof String[]) {
                params.put(name , (String[])value);
            }else if(value instanceof String) {
                params.put(name , new String[] {(String)value});
            }else {
                params.put(name , new String[] {String.valueOf(value)});
            }
        }
    }

}
