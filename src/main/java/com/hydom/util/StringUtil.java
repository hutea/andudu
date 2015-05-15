package com.hydom.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 字符串操作工具集
 * 
 * @author www.hydom.cn [heou]
 */
public class StringUtil {
	private StringUtil() {
	}

	/**
	 * 判断给定字串是否是电话号码
	 * 
	 * @param phone
	 * @return
	 */
	public static boolean isPhoneNumber(String phone) {
		if (phone == null || "".equals(phone)) {
			return false;
		}
		String regex = "^[1](3|5|8)[0-9]{9}$";
		return phone.matches(regex);
	}

	public static String generatorID() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss-");
		Date date = new Date();
		String dateStr = sdf.format(date);
		String id = dateStr + getRandomString(8);
		return id;
	}

	/**
	 * 得到指定长度的随机数
	 * 
	 * @param length
	 * @return
	 */
	private static String getRandomString(int length) {
		String base = "ABCDEFGHIJKLMNOPQURSTUVWXYZ";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(generatorID().length());
		System.out.println(generatorID());
	}
}
