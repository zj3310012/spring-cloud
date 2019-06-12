package com.yt.apiGateway.test;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSONObject;
import com.yt.apiGateway.constants.HttpMessageParams;
import com.yt.apiGateway.utils.AESUtil;
import com.yt.apiGateway.utils.OrdersUtil;
import com.yt.apiGateway.utils.SignForDSA;

public class DoGetAndPost {
	
	public static final String host = "http://localhost:9999/v1/data-exchange";
	
	private static final String publicKey="MIIBtzCCASwGByqGSM44BAEwggEfAoGBAP1/U4EddRIpUt9KnC7s5Of2EbdSPO9EAMMeP4C2USZpRV1AIlH7WT2NWPq/xfW6MPbLm1Vs14E7gB00b/JmYLdrmVClpJ+f6AR7ECLCT7up1/63xhv4O1fnxqimFQ8E+4P208UewwI1VBNaFpEy9nXzrith1yrv8iIDGZ3RSAHHAhUAl2BQjxUjC8yykrmCouuEC/BYHPUCgYEA9+GghdabPd7LvKtcNrhXuXmUr7v6OuqC+VdMCz0HgmdRWVeOutRZT+ZxBxCBgLRJFnEj6EwoFhO3zwkyjMim4TwWeotUfI0o4KOuHiuzpnWRbqN/C/ohNWLx+2J6ASQ7zKTxvqhRkImog9/hWuWfBpKLZl6Ae1UlZAFMO/7PSSoDgYQAAoGAU1OcmDmkF051rlglW7KUVwNhUphCvpw0VP/R0RK4gTimBDqd5xJ/YzHtrs/xU0MLYL+ZAyak0GE0PBxHfjUf7KCrh6NQdm0rgW9t3Gl98gqlj5aZKJYL6jRzKDtWPojuP+uRLasl1mfYL+xVVJBECbx7gTx2H70N72OO9x2/Lb4=";

	private static final String password="MTRlZjg0Mjk3NjdlNDZkZWExNTZiODEwNTQ1Njg3MjI=";
	
	public static String doGet(String url, Map<String, String> param) {

        // 创建Httpclient对象
        CloseableHttpClient httpclient = HttpClients.createDefault();

        String resultString = "";
        CloseableHttpResponse response = null;
        try {
            // 创建uri
            URIBuilder builder = new URIBuilder(url);
            if (param != null) {
                for (String key : param.keySet()) {
                    builder.addParameter(key, param.get(key));
                }
            }
            URI uri = builder.build();
            // 创建http GET请求
            HttpGet httpGet = new HttpGet(uri);
            // 执行请求
            response = httpclient.execute(httpGet);
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
            	String responseString = EntityUtils.toString(response.getEntity(), HttpMessageParams.CHARACTER_ENCODING);
            	resultString = recoverData(responseString);
            }else {
            	String responseString = EntityUtils.toString(response.getEntity(), HttpMessageParams.CHARACTER_ENCODING);
            	resultString = recoverData(responseString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultString;
    }
	
	public static String doPost(String url, Map<String, String> param) {
        // 创建Httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String resultString = "";
        try {
            // 创建Http Post请求
            HttpPost httpPost = new HttpPost(url);
            // 创建参数列表
            if (param != null) {
                List<NameValuePair> paramList = new ArrayList<>();
                for (String key : param.keySet()) {
                    paramList.add(new BasicNameValuePair(key, param.get(key)));
                }
                // 模拟表单
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(paramList);
                httpPost.setEntity(entity);
            }
            // 执行http请求
            response = httpClient.execute(httpPost);
            resultString = EntityUtils.toString(response.getEntity(), HttpMessageParams.CHARACTER_ENCODING);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return resultString;
    }
	
	public static String doPostJson(String url, String json) {
        // 创建Httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String resultString = "";
        try {
            // 创建Http Post请求
            HttpPost httpPost = new HttpPost(url);
            // 创建请求内容
            StringEntity entity = new StringEntity(json, ContentType.APPLICATION_JSON);
            httpPost.setEntity(entity);
            // 执行http请求
            response = httpClient.execute(httpPost);
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
            	String responseString = EntityUtils.toString(response.getEntity(), HttpMessageParams.CHARACTER_ENCODING);
            	resultString = recoverData(responseString);
            }else {
            	String responseString = EntityUtils.toString(response.getEntity(), HttpMessageParams.CHARACTER_ENCODING);
            	resultString = recoverData(responseString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return resultString;
    }
	
	private static String recoverData(String responseData) {
		if(StringUtils.isBlank(responseData)) {
			return null;
		}
		String destData = null;
		JSONObject requestBody = JSONObject.parseObject(responseData);
		// 获取userCode
		String userCode = requestBody.getString(HttpMessageParams.USERCODE);
		// 获取加密响应
		String body = requestBody.getString(HttpMessageParams.BODY);
		// 获取签名
		String sign = requestBody.getString(HttpMessageParams.SIGN);
		// 获取解密字符串
		try {
			String params = AESUtil.AESDncode(body, password);
			JSONObject paramsJson = JSONObject.parseObject(params);
			String code = paramsJson.getString(HttpMessageParams.CODE);
			String timeStamp = paramsJson.getString(HttpMessageParams.TIMESTAMP);
			// 对code和timeStamp进行签名
			Map<String, Object> map = new HashMap<String, Object>();
			map.put(HttpMessageParams.CODE, code);
			map.put(HttpMessageParams.TIMESTAMP, timeStamp);
			String orderParams = OrdersUtil.sortKeyValue(map);
			// 验签
			boolean flag = SignForDSA.verify(orderParams.getBytes(), publicKey, sign);
			if(flag) {
				JSONObject destJson = new JSONObject();
				destJson.put(HttpMessageParams.USERCODE, userCode);
				destJson.put(HttpMessageParams.BODY, JSONObject.parse(params));
				destData = destJson.toString();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return destData;
	}

}
