package com.gsccs.plat.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 日期工具类
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public class DateUtil {

	public static String format(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		if (date != null) {
			return sdf.format(date);
		}
		return "";
	}

	public static Date parse(String date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		if (date != null) {
			try {
				return sdf.parse(date);
			} catch (java.text.ParseException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * 计算两个时间的时间差(毫秒)
	 * 
	 * @param data1
	 * @param date2
	 * @return
	 */
	public static long differ(Date date1, Date date2) {
		if (date1 != null && date2 != null) {
			return date2.getTime() - date1.getTime();
		}
		return 0;
	}
	
	/**
	 * 根据当前时间到毫秒生成订单号
	 * @param date
	 * @return
	 */
	public static String getOrderNum(Date date){
		SimpleDateFormat dateFormatGmt = new SimpleDateFormat("yyyyMMddHHmmssSS");
		if(date != null){
			return dateFormatGmt.format(date);
		}else{
			return null;
		}
	}
	
	
	public static void main(String[] args) {
        float max=0.9f;
        int min=0;
        Random random = new Random();
        float s = random.nextFloat();
        System.out.println(s);
    }
}

