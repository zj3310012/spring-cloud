package com.yt.apiGateway.test;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.zj.apiGateway.constants.HttpMessageParams;
import com.zj.apiGateway.utils.AESUtil;
import com.zj.apiGateway.utils.OrdersUtil;
import com.zj.apiGateway.utils.SignForDSA;

/**
 * 
 * @author zhangjing
 * date: 2019年4月1日 下午4:05:29
 */
public abstract class AbstractCommon {

	public static final String testThirdPrivateKey = "MIIBSwIBADCCASwGByqGSM44BAEwggEfAoGBAP1/U4EddRIpUt9KnC7s5Of2EbdSPO9EAMMeP4C2USZpRV1AIlH7WT2NWPq/xfW6MPbLm1Vs14E7gB00b/JmYLdrmVClpJ+f6AR7ECLCT7up1/63xhv4O1fnxqimFQ8E+4P208UewwI1VBNaFpEy9nXzrith1yrv8iIDGZ3RSAHHAhUAl2BQjxUjC8yykrmCouuEC/BYHPUCgYEA9+GghdabPd7LvKtcNrhXuXmUr7v6OuqC+VdMCz0HgmdRWVeOutRZT+ZxBxCBgLRJFnEj6EwoFhO3zwkyjMim4TwWeotUfI0o4KOuHiuzpnWRbqN/C/ohNWLx+2J6ASQ7zKTxvqhRkImog9/hWuWfBpKLZl6Ae1UlZAFMO/7PSSoEFgIUdczOLDm1MWDKmCUDUedug8m/5Ak=";	
	
	public static final String testThirdKey = "NzY4NmFhMTU1ZjlmNDczZDgzYzkzNzhjNjljOTBlZWI=";
	
	public static final String testUserCode = "00c7cf012fff11e9a91fc85b766499e5";
	
	public static String testGetObjectByDetail(String uri, JSONObject paramJson) throws Exception{
		JSONObject json = new JSONObject();
		json.put(HttpMessageParams.USERCODE, testUserCode);
		System.out.println(paramJson.toString());
		String text = OrdersUtil.sortKeyValue(paramJson);
		json.put(HttpMessageParams.PARAMS, AESUtil.AESEncode(paramJson.toJSONString(), testThirdKey));
		json.put(HttpMessageParams.SIGN, SignForDSA.sign(text, testThirdPrivateKey));
		Map<String,String> map = new HashMap<String,String>();
		map.put(HttpMessageParams.REQUEST_PARAMS, json.toJSONString());
		String url = DoGetAndPost.host+uri;
		String result = DoGetAndPost.doGet(url, map);
		return result;
	}
	
	public static String testGetListByCondition(String uri, JSONObject paramJson) throws Exception{
		JSONObject json = new JSONObject();
		json.put(HttpMessageParams.USERCODE, testUserCode);
		System.out.println(paramJson.toString());
		String text = OrdersUtil.sortKeyValue(paramJson);
		json.put(HttpMessageParams.PARAMS, AESUtil.AESEncode(paramJson.toJSONString(), testThirdKey));
		json.put(HttpMessageParams.SIGN, SignForDSA.sign(text, testThirdPrivateKey));
		String url = DoGetAndPost.host+uri;
		String result = DoGetAndPost.doPostJson(url, json.toJSONString());
		return result;
	}
}
