package com.yt.apiGateway.filter;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.alibaba.fastjson.JSONObject;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.yt.apiGateway.constants.HttpMessageParams;
import com.yt.apiGateway.enums.HttpResponseStatus;
import com.yt.apiGateway.utils.AESUtil;
import com.yt.apiGateway.utils.LocalMapUtil;
import com.yt.apiGateway.utils.OrdersUtil;
import com.yt.apiGateway.utils.SignForDSA;

public abstract class AbstractResponseFilter extends ZuulFilter{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AbstractResponseFilter.class);
	
	@Value("${apiGateway.privateKey}")
	private String privateKey;

	@Value("${apiGateway.password}")
	private String password;

	
	protected void responseErrorBody(HttpResponseStatus status,RequestContext requestContext) {
		//组装错误的body
		JSONObject json = new JSONObject();
		json.put(HttpMessageParams.CODE, status.getCode());
		json.put(HttpMessageParams.DATA, "");
		json.put(HttpMessageParams.MSG, status.getDesc());
		String responseStr;
		try {
			responseStr = getResponse(json.toString());
			requestContext.setResponseBody(responseStr);
			InputStream is = new ByteArrayInputStream(responseStr.getBytes(HttpMessageParams.CHARACTER_ENCODING));
			requestContext.setResponseDataStream(is);
			is.close();
		} catch (Exception e) {
			LOGGER.error("系统异常",e);
			responseErrorBody(HttpResponseStatus.SYSTEM_EXCEPTION,requestContext);
		}

	}

	protected String getResponse(String body) throws Exception {
		//此处要将null值转为空字符串，否则会忽略该字段
		body = body.replace("null", "''");
		JSONObject originJson = JSONObject.parseObject(body);
		String timeStamp = System.currentTimeMillis() + "";
		originJson.put(HttpMessageParams.TIMESTAMP, timeStamp);
		String code = originJson.getString(HttpMessageParams.CODE);
		// 获取threadLocal保存的userCode
		ThreadLocal<String> threadLocal = LocalMapUtil.threadLocal;
		String userCode = threadLocal.get();
		threadLocal.remove();
		// 对响应实体加密
		String entryptbody = AESUtil.AESEncode(originJson.toJSONString(), password);
		// 对code和timeStamp进行签名
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(HttpMessageParams.CODE, code);
		map.put(HttpMessageParams.TIMESTAMP, timeStamp);
		String text = OrdersUtil.sortKeyValue(map);
		String sign = SignForDSA.sign(text, privateKey);
		
		JSONObject headerJson = new JSONObject();
		headerJson.put(HttpMessageParams.USERCODE, userCode);
		// 返回响应结果
		JSONObject responseJson = new JSONObject();
		
		responseJson.put(HttpMessageParams.HEADER, headerJson);
		responseJson.put(HttpMessageParams.BODY, entryptbody);
		responseJson.put(HttpMessageParams.SIGN, sign);
		return responseJson.toJSONString();
	}
}
