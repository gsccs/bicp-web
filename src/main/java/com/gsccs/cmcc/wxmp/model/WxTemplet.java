package com.gsccs.cmcc.wxmp.model;

/**
 * 消息模板
 * 
 * @author think
 * 
 */
public class WxTemplet {

	private String shortid;
	private String appid;
	private String name;
	private String longid;

	public String getShortid() {
		return shortid;
	}

	public void setShortid(String shortid) {
		this.shortid = shortid;
	}

	public String getLongid() {
		return longid;
	}

	public void setLongid(String longid) {
		this.longid = longid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	

}