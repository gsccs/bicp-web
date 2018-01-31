package com.gsccs.cmcc.info.model;

import java.util.Date;


/**
 * pos器具
 * @author x.d zhang
 *
 */
public class Terminal {
	
	
    private String id;
    //序列号
    private String tersn;
    //采购订单
    private String orderno;
    //商户号
    private String mchno;
    //终端号
    private String terno;
    //终端序列号
    private String devsn;
    //终端品牌
    private String brands;
    //终端型号
    private String modelno;
    //程序版本
    private String pgmv;
    
    private Integer curryear;	//目前寿命
    private Integer finayear;	//财务寿命
    
    private String curstore;	//当前所在库
    private String substore;	//子库
    private String area;		//所属地区
    private String locgoods;	//当前所在货位
    private Date locdate;		//货位登记时间
    private Integer locyear;		//当前货位龄
    
    private String mchname;		//商户名称
    private String mchaddr;		//商户地址
    private String userid;		//借机人员
    private String username;
    
    private String loststate;	//丢机前状态
    private String status;
    private Date jointime;
    private Date edittime;
    private String remark;
    private Integer ordernum;
    //产品类型
    private String pdttype;

        
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

	

	public String getMchno() {
		return mchno;
	}

	public void setMchno(String mchno) {
		this.mchno = mchno;
	}

	public String getTerno() {
		return terno;
	}

	public void setTerno(String terno) {
		this.terno = terno;
	}

	public String getDevsn() {
		return devsn;
	}

	public void setDevsn(String devsn) {
		this.devsn = devsn;
	}

	
	public String getBrands() {
		return brands;
	}

	public void setBrands(String brands) {
		this.brands = brands;
	}

	public String getModelno() {
		return modelno;
	}

	public void setModelno(String modelno) {
		this.modelno = modelno;
	}

	public String getPgmv() {
		return pgmv;
	}

	public void setPgmv(String pgmv) {
		this.pgmv = pgmv;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getJointime() {
		return jointime;
	}

	public void setJointime(Date jointime) {
		this.jointime = jointime;
	}

	public Date getEdittime() {
		return edittime;
	}

	public void setEdittime(Date edittime) {
		this.edittime = edittime;
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

	public String getPdttype() {
		return pdttype;
	}

	public void setPdttype(String pdttype) {
		this.pdttype = pdttype;
	}

	public String getTersn() {
		return tersn;
	}

	public void setTersn(String tersn) {
		this.tersn = tersn;
	}

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	public Integer getCurryear() {
		return curryear;
	}

	public void setCurryear(Integer curryear) {
		this.curryear = curryear;
	}

	public Integer getFinayear() {
		return finayear;
	}

	public void setFinayear(Integer finayear) {
		this.finayear = finayear;
	}

	public String getCurstore() {
		return curstore;
	}

	public void setCurstore(String curstore) {
		this.curstore = curstore;
	}

	public String getSubstore() {
		return substore;
	}

	public void setSubstore(String substore) {
		this.substore = substore;
	}

	public String getMchname() {
		return mchname;
	}

	public void setMchname(String mchname) {
		this.mchname = mchname;
	}

	public String getMchaddr() {
		return mchaddr;
	}

	public void setMchaddr(String mchaddr) {
		this.mchaddr = mchaddr;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getLoststate() {
		return loststate;
	}

	public void setLoststate(String loststate) {
		this.loststate = loststate;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLocgoods() {
		return locgoods;
	}

	public void setLocgoods(String locgoods) {
		this.locgoods = locgoods;
	}

	public Date getLocdate() {
		return locdate;
	}

	public void setLocdate(Date locdate) {
		this.locdate = locdate;
	}

	public Integer getLocyear() {
		return locyear;
	}

	public void setLocyear(Integer locyear) {
		this.locyear = locyear;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
    
}