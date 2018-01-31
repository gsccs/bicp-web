package com.gsccs.cmcc.info.model;

import java.util.Date;

public class PropvalT {

	private String id;
	private String propid;
	private String corpid;
	private String productid;
	private String propval;
	private Date addtime;
	private String remark;

	//关联字段
	private String propcode;
	private String proptitle;
	private String showtype;
	private String dictcode;
	private String dictval;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getPropid() {
		return propid;
	}

	public void setPropid(String propid) {
		this.propid = propid == null ? null : propid.trim();
	}

	public String getCorpid() {
		return corpid;
	}

	public void setCorpid(String corpid) {
		this.corpid = corpid == null ? null : corpid.trim();
	}

	public String getProductid() {
		return productid;
	}

	public String getPropval() {
		return propval;
	}

	public void setPropval(String propval) {
		this.propval = propval;
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

	public String getPropcode() {
		return propcode;
	}

	public void setPropcode(String propcode) {
		this.propcode = propcode;
	}

	public String getProptitle() {
		return proptitle;
	}

	public void setProptitle(String proptitle) {
		this.proptitle = proptitle;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getShowtype() {
		return showtype;
	}

	public void setShowtype(String showtype) {
		this.showtype = showtype;
	}

	public String getDictcode() {
		return dictcode;
	}

	public void setDictcode(String dictcode) {
		this.dictcode = dictcode;
	}

	public String getDictval() {
		return dictval;
	}

	public void setDictval(String dictval) {
		this.dictval = dictval;
	}
	
}