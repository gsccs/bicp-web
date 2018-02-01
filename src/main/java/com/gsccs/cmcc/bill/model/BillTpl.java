package com.gsccs.cmcc.bill.model;

import java.util.Date;


/**
 * 账单模板
 * @author x.d zhang
 *
 */
public class BillTpl {

	private Integer id;
	private String title;
	private String status;
	private Date addtime;
	private String kmids;
	private String remark;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getKmids() {
		return kmids;
	}

	public void setKmids(String kmids) {
		this.kmids = kmids;
	}
	
}