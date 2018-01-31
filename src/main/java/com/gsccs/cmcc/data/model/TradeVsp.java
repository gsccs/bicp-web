package com.gsccs.cmcc.data.model;

import java.util.Date;

/**
 * 收银宝交易数据
 * @author x.d zhang
 *
 */
public class TradeVsp {

	private Long id;

	private String mchno;	//商户号
	private String tmlno;	//终端号

	private Date paytime;	//交易时间
	private Float payamount;	//交易金额
	private Float payfee;	//交易手续费
	
	private String paytype;	//交易类型
	private String mchname;
	
	private Integer paynum;	//交易笔数
	private Date enddate;
	private String hasline;

	private String remark;
	private String linename;
	private String payname;
	private String filenames;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMchno() {
		return mchno;
	}

	public void setMchno(String mchno) {
		this.mchno = mchno;
	}

	public String getTmlno() {
		return tmlno;
	}

	public void setTmlno(String tmlno) {
		this.tmlno = tmlno;
	}

	public String getHasline() {
		return hasline;
	}

	public void setHasline(String hasline) {
		this.hasline = hasline == null ? null : hasline.trim();
	}

	public String getPaytype() {
		return paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype == null ? null : paytype.trim();
	}



	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	
	public String getLinename() {
		return linename;
	}

	public void setLinename(String linename) {
		this.linename = linename;
	}

	public String getMchname() {
		return mchname;
	}

	public void setMchname(String mchname) {
		this.mchname = mchname;
	}

	public String getFilenames() {
		return filenames;
	}

	public void setFilenames(String filenames) {
		this.filenames = filenames;
	}


	public String getPayname() {
		return payname;
	}

	public void setPayname(String payname) {
		this.payname = payname;
	}

	

	public Date getPaytime() {
		return paytime;
	}

	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}


	public Float getPayamount() {
		return payamount;
	}

	public void setPayamount(Float payamount) {
		this.payamount = payamount;
	}

	public Float getPayfee() {
		return payfee;
	}

	public void setPayfee(Float payfee) {
		this.payfee = payfee;
	}

	public Integer getPaynum() {
		return paynum;
	}

	public void setPaynum(Integer paynum) {
		this.paynum = paynum;
	}

}