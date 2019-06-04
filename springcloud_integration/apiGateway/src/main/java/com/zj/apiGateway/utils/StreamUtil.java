package com.zj.apiGateway.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.zj.apiGateway.constants.HttpMessageParams;

/**
 * 流工具类
 * 
 * @author zhangjing
 * date: 2019年3月26日 下午2:15:51
 */
public class StreamUtil {

	
	public static String readString(InputStream input, String charset) throws IOException {
		StringBuffer stringBuffer = new StringBuffer();
		InputStreamReader inputStreamReader = new InputStreamReader(input,charset);
		char[] buffer = new char[HttpMessageParams.BUFFER_SIZE];
		int bytesRead = -1;
		while ((bytesRead = inputStreamReader.read(buffer)) != -1) {
			stringBuffer.append(buffer, 0, bytesRead);
		}
		return stringBuffer.toString();
	}
}
