package com.gsccs.cmcc.bill.model;


/**
 * 账单科目 
 * @author x.d zhang
 *
 */
public class Subject {
	
	private Integer id;
	private String code;		//账单编码
	private String name;		//账单名称
	private String groupid;		//分组
	private Double fee;			//默认金额
	private String status;		//状态 启用 关闭

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}
	
	
	
}