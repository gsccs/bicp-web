package com.gsccs.cmcc.bill.model;


/**
 * 账单明细
 * @author x.d zhang
 *
 */
public class BillItem {

	private Long id;
	private String billid;			//账单ID
	private String subjectid;		//科目ID
	private Double fee;				//金额
	private String remark;			//备注信息
	
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
	public String getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(String subjectid) {
		this.subjectid = subjectid;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}