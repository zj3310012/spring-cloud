package com.yt.apiGateway.utils;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;


/**
 * 签名工具
 * 
 * @author zhangjing
 * date: 2019年3月25日 下午3:11:29
 */
public class SignForDSA {

	private static final String PUBLIC_KEY = "DSAPublicKey";
	private static final String PRIVATE_KEY = "DSAPrivateKey";
	public static final String KEY_ALGORITHM = "DSA";
	public static final String SIGNATURE_ALGORITHM = "DSA";
	
	/**
	 * 生成秘钥对
	 * 
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static Map<String, Object> intiSecretKey() throws NoSuchAlgorithmException{
		KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(KEY_ALGORITHM);
		// 可以采用无参构造方法实例化，无需手动设置种子
		SecureRandom secureRandom = new SecureRandom();
		keyPairGenerator.initialize(1024, secureRandom);
		KeyPair keys = keyPairGenerator.genKeyPair();
		PublicKey publicKey = keys.getPublic();
		PrivateKey privateKey = keys.getPrivate();
		Map<String, Object> map = new HashMap<String, Object>(2);
		// 对公钥base64编码
		map.put(PUBLIC_KEY, encryptBASE64(publicKey.getEncoded()));
		// 对私钥base64编码
		map.put(PRIVATE_KEY, encryptBASE64(privateKey.getEncoded()));
		return map;
	}

	/**
	 * 签名
	 * 
	 * @param text
	 * @param privateKey
	 * @return
	 * @throws Exception
	 */
	public static String sign(String text, String privateKey) throws Exception{
		byte[] data = text.getBytes();
		// 解码由base64编码的私钥
		byte[] keyBytes = decryptBASE64(privateKey);
		// 构造PKCS8EncodedKeySpec对象
		PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
		// KEY_ALGORITHM 指定的加密算法
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
		PrivateKey priKey = keyFactory.generatePrivate(pkcs8KeySpec);
		// 用私钥对信息生成数字签名
		Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
		signature.initSign(priKey);
		signature.update(data);

		return encryptBASE64(signature.sign());
	}

	/**
	 * 验证签名
	 * 
	 * @param data
	 * @param publicKey
	 * @param sign
	 * @return
	 * @throws Exception
	 */
	public static boolean verify(byte[] data, String publicKey, String sign) throws Exception {
		// 解码由base64编码的公钥
		byte[] keyBytes = decryptBASE64(publicKey);
		// 构造X509EncodedKeySpec对象
		X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
		// KEY_ALGORITHM 指定的加密算法
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
		// 取公钥对象
		PublicKey pubKey = keyFactory.generatePublic(keySpec);
		Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
		signature.initVerify(pubKey);
		signature.update(data);
		// 验证签名是否正常
		return signature.verify(decryptBASE64(sign));
	}

	private static byte[] decryptBASE64(String data) throws Exception {
		return Base64.getDecoder().decode(data);
	}

	private static String encryptBASE64(byte[] key) {
		return Base64.getEncoder().encodeToString(key);
	}
}
