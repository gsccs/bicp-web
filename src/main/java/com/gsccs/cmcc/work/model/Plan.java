package com.gsccs.cmcc.work.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计划对象
 * @author x.d zhang
 */
public class Plan {

	private String id;
	private String title;
	private String content;
	private String mainuser;		//负责人
	private Date addtime;			//创建时间
	private Date pstarttime;		//计划开始
	private Date pendtime;			//计划完成
	private String state;			//状态
	private String remark;	
	private Date endtime;			//实际时间
	private String joinusers;		//参与者
	private String address;			//地址
	private String iswxmsg;			//是否发送通知
	private String msgstate;		//微信消息状态 
	private Integer ordernum;		//顺序
	private String projid;			//关联项目
	
	private String pstartstr;
	private String pendstr;
	private String addtimestr;
	private String endtimestr;

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
		this.title = title == null ? null : title.trim();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}


	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	
	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	
	
	public String getMainuser() {
		return mainuser;
	}

	public void setMainuser(String mainuser) {
		this.mainuser = mainuser;
	}

	public Date getPstarttime() {
		return pstarttime;
	}

	public void setPstarttime(Date pstarttime) {
		this.pstarttime = pstarttime;
	}

	public Date getPendtime() {
		return pendtime;
	}

	public void setPendtime(Date pendtime) {
		this.pendtime = pendtime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getJoinusers() {
		return joinusers;
	}

	public void setJoinusers(String joinusers) {
		this.joinusers = joinusers;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIswxmsg() {
		return iswxmsg;
	}

	public void setIswxmsg(String iswxmsg) {
		this.iswxmsg = iswxmsg;
	}
	
	public String getMsgstate() {
		return msgstate;
	}

	public void setMsgstate(String msgstate) {
		this.msgstate = msgstate;
	}

	public void setPstartstr(String pstartstr) {
		this.pstartstr = pstartstr;
	}

	public void setPendstr(String pendstr) {
		this.pendstr = pendstr;
	}

	public void setAddtimestr(String addtimestr) {
		this.addtimestr = addtimestr;
	}

	public void setEndtimestr(String endtimestr) {
		this.endtimestr = endtimestr;
	}
	
	public Integer getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(Integer ordernum) {
		this.ordernum = ordernum;
	}

	public String getProjid() {
		return projid;
	}

	public void setProjid(String projid) {
		this.projid = projid;
	}

	public String getPstartstr() {
		if (null != getPstarttime()) {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			pstartstr = df.format(getPstarttime());
		}
		return pstartstr;
	}

	public String getPendstr() {
		if (null != getPendtime()) {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			pendstr = df.format(getPendtime());
		}
		return pendstr;
	}

	public String getAddtimestr() {
		if (null != getAddtime()) {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			addtimestr = df.format(getAddtime());
		}
		return addtimestr;
	}

	public String getEndtimestr() {
		if (null != getEndtime()) {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			endtimestr = df.format(getEndtime());
		}
		return endtimestr;
	}

}