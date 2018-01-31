package com.gsccs.cmcc.info.model;

import java.util.Date;

/**
 * 商户信息
 * @author x.d zhang
 *
 */
public class Merchant {

	private String id;
	private String title;
	private String phone;
	private String email;
	private String linker;
	private Integer acode;
	private String address;
	private String status;
	private Date addtime;		//合作开始日期
	private Date endtime;		//合作终止日期
	private String mchno;
	//客户经理ID
	private Long amUserId;
	private String amName;
	private String acodeName;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getLinker() {
		return linker;
	}

	public void setLinker(String linker) {
		this.linker = linker == null ? null : linker.trim();
	}

	public Integer getAcode() {
		return acode;
	}

	public void setAcode(Integer acode) {
		this.acode = acode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getAmUserId() {
		return amUserId;
	}

	public void setAmUserId(Long amUserId) {
		this.amUserId = amUserId;
	}

	public String getAmName() {
		return amName;
	}

	public void setAmName(String amName) {
		this.amName = amName;
	}

	public String getAcodeName() {
		return acodeName;
	}

	public void setAcodeName(String acodeName) {
		this.acodeName = acodeName;
	}

	public String getMchno() {
		return mchno;
	}

	public void setMchno(String mchno) {
		this.mchno = mchno;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	
	
}