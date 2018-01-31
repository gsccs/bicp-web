package com.allinpay.cmcc.syb.lib;

import java.util.Map;
import java.util.TreeMap;

public class SybPayService {
	
	
	//请求报文{"acct":"2088121458569201","appid":"00000051","cusid":"990581007426001","limit_pay":"no_credit","notify_url":"http://15.126.89.54:2141","paytype":"A02","randomstr":"VAZOXG3DGFN4XAAB8VAW3MVQQ4XTGLAN","reqsn":"2017030900000001","sign":"1B459E77251E5F92A06126E44C492B81","trxamt":"1","version":"11"}
	
	public Map<String,String> wxMpPay(String trxamt,String reqsn,String body,String remark,String acct,String limit_pay) throws Exception{
		return pay(trxamt, reqsn, "W02", body, remark, acct, SybConstants.notify_url, limit_pay);
	}
	
	/**
	 * 
	 * @param trxamt
	 * @param reqsn		
	 * @param paytype	
	 * @param body
	 * @param remark
	 * @param acct
	 * @param notify_url
	 * @param limit_pay
	 * @return
	 * @throws Exception
	 */
	public Map<String,String> pay(String trxamt,String reqsn,String paytype,String body,String remark,String acct,String notify_url,String limit_pay) throws Exception{
		HttpConnectionUtil http = new HttpConnectionUtil(SybConstants.SYB_APIURL+"/pay");
		http.init();
		TreeMap<String,String> params = new TreeMap<String,String>();
		params.put("cusid", SybConstants.SYB_CUSID);
		params.put("appid", SybConstants.SYB_APPID);
		params.put("version", "11");
		params.put("trxamt", trxamt);
		params.put("reqsn", reqsn);
		params.put("paytype", paytype);
		params.put("randomstr", SybUtil.getValidatecode(8));
		params.put("body", body);
		params.put("remark", remark);
		params.put("acct", acct);									//支付平台用户标识
		//params.put("authcode", authcode);							
		params.put("notify_url", notify_url);						//交易结果通知地址
		params.put("limit_pay", limit_pay);
		params.put("sign", SybUtil.sign(params,SybConstants.SYB_APPKEY));
		byte[] bys = http.postParams(params, true);
		String result = new String(bys,"UTF-8");
		Map<String,String> map = handleResult(result);
		return map;
	}
	
	
	public Map<String,String> cancel(long trxamt,String reqsn,String oldtrxid,String oldreqsn) throws Exception{
		HttpConnectionUtil http = new HttpConnectionUtil(SybConstants.SYB_APIURL+"/cancel");
		http.init();
		TreeMap<String,String> params = new TreeMap<String,String>();
		params.put("cusid", SybConstants.SYB_CUSID);
		params.put("appid", SybConstants.SYB_APPID);
		params.put("version", "11");
		params.put("trxamt", String.valueOf(trxamt));
		params.put("reqsn", reqsn);
		params.put("oldtrxid", oldtrxid);
		params.put("oldreqsn", oldreqsn);
		params.put("randomstr", SybUtil.getValidatecode(8));
		params.put("sign", SybUtil.sign(params,SybConstants.SYB_APPKEY));
		byte[] bys = http.postParams(params, true);
		String result = new String(bys,"UTF-8");
		Map<String,String> map = handleResult(result);
		return map;
	}
	
	public Map<String,String> refund(long trxamt,String reqsn,String oldtrxid,String oldreqsn) throws Exception{
		HttpConnectionUtil http = new HttpConnectionUtil(SybConstants.SYB_APIURL+"/refund");
		http.init();
		TreeMap<String,String> params = new TreeMap<String,String>();
		params.put("cusid", SybConstants.SYB_CUSID);
		params.put("appid", SybConstants.SYB_APPID);
		params.put("version", "11");
		params.put("trxamt", String.valueOf(trxamt));
		params.put("reqsn", reqsn);
		params.put("oldreqsn", oldreqsn);
		params.put("oldtrxid", oldtrxid);
		params.put("randomstr", SybUtil.getValidatecode(8));
		params.put("sign", SybUtil.sign(params,SybConstants.SYB_APPKEY));
		byte[] bys = http.postParams(params, true);
		String result = new String(bys,"UTF-8");
		Map<String,String> map = handleResult(result);
		return map;
	}
	
	public Map<String,String> query(String reqsn,String trxid) throws Exception{
		HttpConnectionUtil http = new HttpConnectionUtil(SybConstants.SYB_APIURL+"/query");
		http.init();
		TreeMap<String,String> params = new TreeMap<String,String>();
		params.put("cusid", SybConstants.SYB_CUSID);
		params.put("appid", SybConstants.SYB_APPID);
		params.put("version", "11");
		params.put("reqsn", reqsn);
		params.put("trxid", trxid);
		params.put("randomstr", SybUtil.getValidatecode(8));
		params.put("sign", SybUtil.sign(params,SybConstants.SYB_APPKEY));
		byte[] bys = http.postParams(params, true);
		String result = new String(bys,"UTF-8");
		Map<String,String> map = handleResult(result);
		return map;
	}
	
	public Map<String,String> down(String date) throws Exception{
		HttpConnectionUtil http = new HttpConnectionUtil(SybConstants.BILL_APIURL+"/trxfile/get");
		http.init();
		TreeMap<String,String> params = new TreeMap<String,String>();
		params.put("cusid", SybConstants.BILL_CUSID);
		params.put("appid", SybConstants.BILL_APPID);
		params.put("date", date);
		params.put("randomstr", SybUtil.getValidatecode(8));
		params.put("sign", SybUtil.sign(params,SybConstants.BILL_APPKEY));
		byte[] bys = http.postParams(params, true);
		String result = new String(bys,"UTF-8");
		Map<String,String> map = handleResult(result);
		return map;
	}
	
	
	public static Map<String,String> handleResult(String result) throws Exception{
		System.out.println(result);
		Map map = SybUtil.json2Obj(result, Map.class);
		if(map == null){
			throw new Exception("返回数据错误");
		}
		if("SUCCESS".equals(map.get("retcode"))){
			TreeMap tmap = new TreeMap();
			tmap.putAll(map);
			String sign = tmap.remove("sign").toString();
			String sign1 = SybUtil.sign(tmap,SybConstants.BILL_APPKEY);
			if(sign1.toLowerCase().equals(sign.toLowerCase())){
				return map;
			}else{
				throw new Exception("验证签名失败");
			}
			
		}else{
			throw new Exception(map.get("retmsg").toString());
		}
	}
	
	
}
