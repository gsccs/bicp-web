package com.gsccs.cmcc.info.model;

import java.util.Date;

/**
 * 商户订购关系
 * @author x.d zhang
 *
 */
public class Ordered {
	
    private String mctId;
    private String mctNo;
    private String pdtId;
    private String status;
    private Date startTime;
    
    //
    private String pdtName;
    private String mchName;
    
    
	public String getMctId() {
		return mctId;
	}
	public void setMctId(String mctId) {
		this.mctId = mctId;
	}
	public String getMctNo() {
		return mctNo;
	}
	public void setMctNo(String mctNo) {
		this.mctNo = mctNo;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public String getPdtId() {
		return pdtId;
	}
	public void setPdtId(String pdtId) {
		this.pdtId = pdtId;
	}
	public String getPdtName() {
		return pdtName;
	}
	public void setPdtName(String pdtName) {
		this.pdtName = pdtName;
	}
	public String getMchName() {
		return mchName;
	}
	public void setMchName(String mchName) {
		this.mchName = mchName;
	}
    
}