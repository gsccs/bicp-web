package com.gsccs.cmcc.bill.model;

import java.util.Date;


/**
 * 账单明细
 * @author x.d zhang
 *
 */
public class BillItem {

	private Long id;
	private String billid;			//账单ID
	private Integer kmid;			//科目ID
	private Float fee;				//金额
	private String remark;			//备注信息
	private Date addtime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBillid() {
		return billid;
	}
	public void setBillid(String billid) {
		this.billid = billid;
	}
	public Float getFee() {
		return fee;
	}
	public void setFee(Float fee) {
		this.fee = fee;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public Integer getKmid() {
		return kmid;
	}
	public void setKmid(Integer kmid) {
		this.kmid = kmid;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	
	
	
}