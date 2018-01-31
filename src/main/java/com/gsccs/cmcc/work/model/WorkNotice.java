package com.gsccs.cmcc.work.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WorkNotice {

	private String id;
	private String title;
	private String content;
	private Date addtime;
	private String state;

	private String addtimestr;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state == null ? null : state.trim();
	}

	public String getAddtimestr() {
		if (null != getAddtime()) {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			addtimestr = df.format(getAddtime());
		}
		return addtimestr;
	}

	public void setAddtimestr(String addtimestr) {
		this.addtimestr = addtimestr;
	}

}