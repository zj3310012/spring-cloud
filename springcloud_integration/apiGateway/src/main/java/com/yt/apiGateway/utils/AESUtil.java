package com.yt.apiGateway.utils;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.UUID;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


/**
 * 加解密
 * 
 * @author zhangjing
 * date: 2019年3月25日 下午4:08:48
 */
public class AESUtil {
	
	/**
	 * 加密
	 * 
	 * @param content
	 * @param password
	 * @return
	 * @throws NoSuchAlgorithmException 
	 * @throws NoSuchPaddingException 
	 * @throws InvalidKeyException 
	 * @throws UnsupportedEncodingException 
	 * @throws BadPaddingException 
	 * @throws IllegalBlockSizeException 
	 * @throws Exception
	 */
	public static String AESEncode(String content, String password) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException {
		// 1.构造密钥生成器，指定为AES算法,不区分大小写
		KeyGenerator keygen = KeyGenerator.getInstance("AES");
		// 2.根据password规则初始化密钥生成器
		// 生成一个128位的随机源,根据传入的字节数组
		keygen.init(128, new SecureRandom(password.getBytes()));
		// 3.产生原始对称密钥
		SecretKey original_key = keygen.generateKey();
		// 4.获得原始对称密钥的字节数组
		byte[] raw = original_key.getEncoded();
		// 5.根据字节数组生成AES密钥
		SecretKey key = new SecretKeySpec(raw, "AES");
		// 6.根据指定算法AES自成密码器
		Cipher cipher = Cipher.getInstance("AES");
		// 7.初始化密码器，第一个参数为加密(Encrypt_mode)或者解密解密(Decrypt_mode)操作，第二个参数为使用的KEY
		cipher.init(Cipher.ENCRYPT_MODE, key);
		// 8.获取加密内容的字节数组(这里要设置为utf-8)不然内容中如果有中文和英文混合中文就会解密为乱码
		byte[] byteEncode = content.getBytes("utf-8");
		// 9.根据密码器的初始化方式--加密：将数据加密
		byte[] byteAES = cipher.doFinal(byteEncode);
		// 10.使用BASE64编码
		String AESEncode = new String(Base64.getEncoder().encode(byteAES));
		// 11.将字符串返回
		return AESEncode;
	}

	/**
	 * 解密
	 * 
	 * @param content
	 * @param password
	 * @return
	 * @throws NoSuchAlgorithmException 
	 * @throws NoSuchPaddingException 
	 * @throws InvalidKeyException 
	 * @throws BadPaddingException 
	 * @throws IllegalBlockSizeException 
	 * @throws Exception
	 */
	public static String AESDncode(String content, String password) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException{
		// 1.构造密钥生成器，指定为AES算法,不区分大小写
		KeyGenerator keygen = KeyGenerator.getInstance("AES");
		// 2.根据password规则初始化密钥生成器
		// 生成一个128位的随机源,根据传入的字节数组
		keygen.init(128, new SecureRandom(password.getBytes()));
		// 3.产生原始对称密钥
		SecretKey original_key = keygen.generateKey();
		// 4.获得原始对称密钥的字节数组
		byte[] raw = original_key.getEncoded();
		// 5.根据字节数组生成AES密钥
		SecretKey key = new SecretKeySpec(raw, "AES");
		// 6.根据指定算法AES自成密码器
		Cipher cipher = Cipher.getInstance("AES");
		// 7.初始化密码器，第一个参数为加密(Encrypt_mode)或者解密(Decrypt_mode)操作，第二个参数为使用的KEY
		cipher.init(Cipher.DECRYPT_MODE, key);
		// 8.将加密并编码后的内容解码成字节数组
		byte[] byteContent = Base64.getDecoder().decode(content);
		// 9.解密
		byte[] byteDecode = cipher.doFinal(byteContent);
		String AESDecode = new String(byteDecode);
		return AESDecode;
	}
	
	public static void main(String[] args) throws Exception {
		/*
		 * String encodeStr = AESUtil.AESEncode("圆通全球集运", testKey);
		 * System.out.println("加密之后的密文："+encodeStr); String str =
		 * AESUtil.AESDncode(encodeStr, testKey); System.out.println("解密之后的明文："+str);
		 */
		String password = UUID.randomUUID().toString().replace("-", "");
		System.out.println("password: "+password);
	}
}
