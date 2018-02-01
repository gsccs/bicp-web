package com.gsccs.cmcc.process.model;


/**
 * 流程节点
 * @author x.d zhang
 */
public class Node {

	private Integer id;
	private String tcode;		//任务KEY
	private String tname;		//任务名称
	private String defid;		//流程定义ID 
	private String userid;		
	private String iswxmsg;		//微信通知
	private String remark;		
	private Integer ordernum;	//排序
	private String status;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDefid() {
		return defid;
	}

	public void setDefid(String defid) {
		this.defid = defid;
	}

	public String getTcode() {
		return tcode;
	}

	public void setTcode(String tcode) {
		this.tcode = tcode;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getIswxmsg() {
		return iswxmsg;
	}

	public void setIswxmsg(String iswxmsg) {
		this.iswxmsg = iswxmsg;
	}

	public Integer getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(Integer ordernum) {
		this.ordernum = ordernum;
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
	
}