package com.gsccs.cmcc.work.model;

import java.util.Date;

/**
 * 项目对象
 * @author x.d zhang
 *
 */
public class Project {
	
    private String id;
    private String pcode;			//项目编号
    private String mchno;			//商户号
    private String title;			//项目名称
    
    private String needs;			//需求信息
    private String neederid;		//需求人
    private Date addtime;			//创建时间
    private Date onlinetime;		//上线时间
    private Date pstarttime;		//计划开始时间
    private Date pcompdtime;		//计划完成时间
    private String status;
    private String remark;
    private Integer ordernum;
    
    //查询显示
    private String mchname;
    private String needername;
    private String addtimestr;
    private String pstarttimestr;
    private String pcompdtimestr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
    
	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getMchno() {
		return mchno;
	}

	public void setMchno(String mchno) {
		this.mchno = mchno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNeeds() {
		return needs;
	}

	public void setNeeds(String needs) {
		this.needs = needs;
	}

	public String getNeederid() {
		return neederid;
	}

	public void setNeederid(String neederid) {
		this.neederid = neederid;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Date getPstarttime() {
		return pstarttime;
	}

	public void setPstarttime(Date pstarttime) {
		this.pstarttime = pstarttime;
	}

	public Date getPcompdtime() {
		return pcompdtime;
	}

	public void setPcompdtime(Date pcompdtime) {
		this.pcompdtime = pcompdtime;
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

	public Integer getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(Integer ordernum) {
		this.ordernum = ordernum;
	}

	public String getMchname() {
		return mchname;
	}

	public void setMchname(String mchname) {
		this.mchname = mchname;
	}

	public String getNeedername() {
		return needername;
	}

	public void setNeedername(String needername) {
		this.needername = needername;
	}

	public String getAddtimestr() {
		return addtimestr;
	}

	public void setAddtimestr(String addtimestr) {
		this.addtimestr = addtimestr;
	}

	public String getPstarttimestr() {
		return pstarttimestr;
	}

	public void setPstarttimestr(String pstarttimestr) {
		this.pstarttimestr = pstarttimestr;
	}

	public String getPcompdtimestr() {
		return pcompdtimestr;
	}

	public void setPcompdtimestr(String pcompdtimestr) {
		this.pcompdtimestr = pcompdtimestr;
	}

	public Date getOnlinetime() {
		return onlinetime;
	}

	public void setOnlinetime(Date onlinetime) {
		this.onlinetime = onlinetime;
	}
	
    
}