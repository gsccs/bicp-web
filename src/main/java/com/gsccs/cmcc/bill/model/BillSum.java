package com.gsccs.cmcc.bill.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 账单汇总对象
 * @author x.d zhang
 *
 */
public class BillSum {

	private Long id;
	private String billno;			//账单编号
	private String userid;			//付款人
	private Date starttime;			//开始时间
	private Date endtime;			//退款时间
	private Double sumfee = 0.00;			//汇总金额
	private Double disfee = 0.00;			//折扣金额
	private Double payfee = 0.00;			//支付金额
	private String status;		//状态
	private String remark;		//状态
	
	private String realname;		
	private String openid;		
	List<BillItem> itemList;	//账单明细

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBillno() {
		return billno;
	}

	public void setBillno(String billno) {
		this.billno = billno;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public Double getSumfee() {
		return sumfee;
	}

	public void setSumfee(Double sumfee) {
		this.sumfee = sumfee;
	}

	public Double getDisfee() {
		return disfee;
	}

	public void setDisfee(Double disfee) {
		this.disfee = disfee;
	}
	
	public Double getPayfee() {
		payfee = sumfee+disfee;
		BigDecimal bg = new BigDecimal(payfee).setScale(2,BigDecimal.ROUND_HALF_UP);
		return bg.doubleValue();
	}

	public void setPayfee(Double payfee) {
		this.payfee = payfee;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public List<BillItem> getItemList() {
		return itemList;
	}

	public void setItemList(List<BillItem> itemList) {
		this.itemList = itemList;
	}
	
}
