package com.gsccs.cmcc.bill.model;

import java.util.Date;
import java.util.List;

/**
 * 账单汇总对象
 * @author x.d zhang
 *
 */
public class BillSum {

	private String id;
	private String userid;		//付款人
	private Date starttime;		//开始时间
	private Date endtime;		//退款时间
	private Double fee;			//汇总金额
	private String status;		//状态
	
	List<BillItem> itemList;	//账单明细

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<BillItem> getItemList() {
		return itemList;
	}

	public void setItemList(List<BillItem> itemList) {
		this.itemList = itemList;
	}
	
}
