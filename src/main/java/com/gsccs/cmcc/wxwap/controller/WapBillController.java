package com.gsccs.cmcc.wxwap.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.allinpay.cmcc.syb.lib.SybConstants;
import com.allinpay.cmcc.syb.lib.SybPayService;
import com.allinpay.cmcc.syb.lib.SybUtil;
import com.gsccs.cmcc.bill.model.BillSum;
import com.gsccs.cmcc.bill.service.BillService;
import com.gsccs.cmcc.wxmp.model.WxApp;

/**
 * 微信账单应用
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller
@RequestMapping("/web/{appid}")
public class WapBillController extends WapMpController{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private BillService billService;
	
	/**
	 * 管理页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/bills")
	public String billList(
			@PathVariable("appid") String appid,
			@RequestParam(defaultValue = "") String openid,
			@RequestParam(defaultValue = "") String code,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize,
			@RequestParam(defaultValue = "") String order, ModelMap map,
			HttpServletRequest request, HttpServletResponse response) {
		//1、判断当前openid是否存在，
		if(StringUtils.isEmpty(openid)){
			openid = getOpenid(appid,code);
		}
		List<WxApp> wxAppList = wxAppService.find(null, order, currPage,
				pageSize, false);
		map.put("list", wxAppList);
		map.put("order", order);
		return "wxwap/bill_list";
	}

	
	/**
	 * 账单详情
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/bill-{id}", method = RequestMethod.GET)
	public String billView(
			@PathVariable("appid") String appid,
			@RequestParam(defaultValue = "") String id,
			ModelMap map,
			HttpServletRequest request, HttpServletResponse response) {
		return "wxwap/bill_view";
	}

	
	/**
	 * 账单支付
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/billPay", method = RequestMethod.GET)
	public String billPay(String id, ModelMap map) {
		if (StringUtils.isEmpty(id)){
			logger.info("账单不存在");
		}
		try {
			SybPayService sybPayService =  new SybPayService();
			BillSum billSum = billService.getBillSum(id);
			if(null != billSum){
				double payfee = billSum.getPayfee();
				BigDecimal bg = new BigDecimal(payfee).movePointLeft(2);
				Map<String, String> rspMap = sybPayService.wxMpPay(bg.toString(), billSum.getId().toString(), billSum.getBillno(), billSum.getRemark(), billSum.getOpenid(), "");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "wxwap/bill_pay";
	}

	
	/**
	 * 账单支付结果通知
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/payNotify")
	public String payNotify(ModelMap map) {
		
		TreeMap<String,String> params = getParams(request);
		try {
			boolean isSign = SybUtil.validSign(params, SybConstants.SYB_APPKEY);
			//验签完毕进行业务处理
			if (isSign){
				String trxid = params.get("trxid");
				String trxamt = params.get("trxamt");
				String trxstatus = params.get("trxstatus");
				String cusid = params.get("cusid");
				String cusorderid = params.get("cusorderid");
				String acct = params.get("acct");
			}
		} catch (Exception e) {	//处理异常
			e.printStackTrace();
		}finally{				//收到通知,返回success
			/*try {
				response.getOutputStream().write("success".getBytes());
				response.flushBuffer();
			} catch (IOException e) {
				e.printStackTrace();
			}*/
		}
		return "success";
	}
	
	
	/**
	 * 动态遍历获取所有收到的参数,此步非常关键,因为收银宝以后可能会加字段,动态获取可以兼容由于收银宝加字段而引起的签名异常
	 * @param request
	 * @return
	 */
	private TreeMap<String, String> getParams(HttpServletRequest request){
		TreeMap<String, String> map = new TreeMap<String, String>();
		Map reqMap = request.getParameterMap();
		for(Object key:reqMap.keySet()){
			String value = ((String[])reqMap.get(key))[0];
			System.out.println(key+";"+value);
			map.put(key.toString(),value);
		}
		return map;
	}
	
	public static void main(String[] args) {
		String fee = "0.018";
		BigDecimal bg = new BigDecimal(fee).setScale(2,BigDecimal.ROUND_HALF_UP);
		System.out.println("1= "+bg.doubleValue());
		long feel = new BigDecimal(fee).setScale(2,BigDecimal.ROUND_HALF_UP).movePointRight(2).longValue();
		System.out.println(feel);
	}
	
	
	
}
