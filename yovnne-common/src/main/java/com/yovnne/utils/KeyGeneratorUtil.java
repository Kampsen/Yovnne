
package com.yovnne.utils;

import java.util.UUID;

public class KeyGeneratorUtil {
	
	private static String[] chars = new String[] { "a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",  
            "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",  
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",  
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",  
            "W", "X", "Y", "Z" };
	
	private KeyGeneratorUtil() {
		super();
	}


	/*
	* 36位UUID生成（16进制）
	* 056085ce-8e46-492a-bcec-9a4d3690ce83
	* 8 + 4 + 4 + 4 + 12("-"占4位)
	* */
	public static String getUuid(){
		String keyId = UUID.randomUUID().toString();//.replaceAll("-", "");
		return keyId;
	}
	

	public static String getBusinessCode(){
		return getBusinessCode("");
	}
	public static String getBusinessCode(String type){

		long keyId = System.nanoTime();
		return String.valueOf(keyId);
	}

	// 8位随机码
	public static String getUUID8Characters() {  
	    StringBuffer shortBuffer = new StringBuffer();  
	    String uuid = UUID.randomUUID().toString().replace("-", "");  
	    for (int i = 0; i < 8; i++) {  
	        String str = uuid.substring(i * 4, i * 4 + 4);  
	        int x = Integer.parseInt(str, 16);  
	        shortBuffer.append(chars[x % 0x3E]);  
	    }  
	    return shortBuffer.toString();  
	  
	}  
	
}
