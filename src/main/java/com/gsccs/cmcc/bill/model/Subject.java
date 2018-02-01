package com.gsccs.cmcc.bill.model;

import java.util.Date;


/**
 * 账单科目 
 * @author x.d zhang
 *
 */
public class Subject {
	
	private Integer id;
	private String code;			//科目编码
	private String title;			//科目名称
	private String groupid;			//分组
	private Float fee = 0.00f;		//默认金额
	private String status;			//状态 启用 关闭
	private Date addtime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getGroupid() {
		return groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public Float getFee() {
		return fee;
	}

	public void setFee(Float fee) {
		this.fee = fee;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	
}