package com.gsccs.plat.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

public class Test {
	
public static void main(String[] args) {
	String amount = "1";

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
    String timeStr = dateFormat.format(new Date());
    String orderStr = timeStr + "0000";

    JSONObject paaParams = new JSONObject();
    try {
        paaParams.put("inputCharset", "1");
        paaParams.put("receiveUrl", "http://git3.maya1618.com:5001/order/allinpay/notify");
        paaParams.put("version", "v1.0");
        paaParams.put("signType", "0");
        paaParams.put("merchantId", "008120148160117");
        paaParams.put("orderNo", orderStr);
        paaParams.put("orderAmount", amount);
        paaParams.put("orderCurrency", "156");
        paaParams.put("orderDatetime", timeStr);
        paaParams.put("productName", "玛雅六月订单-5761502098647488");
        
        JSONObject ext2param = new JSONObject();
        ext2param.put("pay_name", "通联支付");
        ext2param.put("pay_id", "10002");
        ext2param.put("pay_user_id", "576");
        
		//paaParams.put("ext2", "{\"pay_name\":\"通联支付\",\"pay_id\":\"10002\",\"pay_user_id\":\"576\"}");
        paaParams.put("ext2", ext2param.toJSONString());
		paaParams.put("ext1", "<USER>170807119979613</USER>");
        paaParams.put("payType", "33");
//		paaParams.put("issuerId", "visa");
//		paaParams.put("tradeNature", "GOODS");
//		paaParams.put("language", "3");
        paaParams.put("cardNo", "");
    } catch (JSONException e) {
        e.printStackTrace();
    }
		
}
}
