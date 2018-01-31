package com.gsccs.cmcc.bill.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SemreportT {

	private String id;
	private String corpid;

	private Date adddate;
	private String amuserid;
	private Date addtime;
	private String status;

	List<BillItem> recomds;
	List<Subject> results;

	private String adddateStr;
	private String corptitle;
	private String areastr;
	private String amname;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getAdddate() {
		return adddate;
	}

	public String getCorpid() {
		return corpid;
	}

	public void setCorpid(String corpid) {
		this.corpid = corpid;
	}

	public void setAdddate(Date adddate) {
		this.adddate = adddate;
	}

	public String getAmuserid() {
		return amuserid;
	}

	public void setAmuserid(String amuserid) {
		this.amuserid = amuserid;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<BillItem> getRecomds() {
		return recomds;
	}

	public void setRecomds(List<BillItem> recomds) {
		this.recomds = recomds;
	}

	public String getCorptitle() {
		return corptitle;
	}

	public void setCorptitle(String corptitle) {
		this.corptitle = corptitle;
	}

	public String getAmname() {
		return amname;
	}

	public void setAmname(String amname) {
		this.amname = amname;
	}

	public List<Subject> getResults() {
		return results;
	}

	public void setResults(List<Subject> results) {
		this.results = results;
	}

	public String getAdddateStr() {
		if (null != adddate) {
			SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
			adddateStr = df.format(adddate);
		}
		return adddateStr;
	}

	public void setAdddateStr(String adddateStr) {
		this.adddateStr = adddateStr;
	}

	public String getAreastr() {
		return areastr;
	}

	public void setAreastr(String areastr) {
		this.areastr = areastr;
	}

}