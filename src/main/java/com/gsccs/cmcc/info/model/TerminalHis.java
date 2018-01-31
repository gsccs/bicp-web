package com.gsccs.cmcc.info.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 使用记录
 * @author x.d zhang
 *
 */
public class TerminalHis {
	
    private String id;

    private String parid;		
    private String mchno;		//商户号
    private String terno;		//终端号
    private String pgmv;		//程序版本
    private String userid;		//领用人
    private String remark;
    
    private String edittype;	//变更类型
    private Date edittime;		//变更时间
    private String edittimeStr;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

	public String getParid() {
		return parid;
	}

	public void setParid(String parid) {
		this.parid = parid;
	}

	public String getTerno() {
		return terno;
	}

	public void setTerno(String terno) {
		this.terno = terno;
	}

	public String getPgmv() {
		return pgmv;
	}

	public void setPgmv(String pgmv) {
		this.pgmv = pgmv;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getMchno() {
		return mchno;
	}

	public void setMchno(String mchno) {
		this.mchno = mchno;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getEdittype() {
		return edittype;
	}

	public void setEdittype(String edittype) {
		this.edittype = edittype;
	}

	public Date getEdittime() {
		return edittime;
	}

	public void setEdittime(Date edittime) {
		this.edittime = edittime;
	}

	public String getEdittimeStr() {
		if (getEdittime() != null) {
			edittimeStr = new SimpleDateFormat("yyyy-MM-dd")
					.format(getEdittime());
		}
		return edittimeStr;
	}
    
}