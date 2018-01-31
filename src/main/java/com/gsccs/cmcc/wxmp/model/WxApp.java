package com.gsccs.cmcc.wxmp.model;


/**
 * 微信应用
 * 
 * @author x.d zhang
 * 
 */
public class WxApp {

	private String id;
	private String secret;
	private String token;
	private String accessToken;
	private String aesKey;
	private Long expirestime;
	private String apikey;
	private String mchid;
	private String status;
	private String title;
	private String domain;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret == null ? null : secret.trim();
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token == null ? null : token.trim();
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken == null ? null : accessToken.trim();
	}

	public String getAesKey() {
		return aesKey;
	}

	public void setAesKey(String aesKey) {
		this.aesKey = aesKey == null ? null : aesKey.trim();
	}

	public Long getExpirestime() {
		return expirestime;
	}

	public void setExpirestime(Long expirestime) {
		this.expirestime = expirestime;
	}

	public String getApikey() {
		return apikey;
	}

	public void setApikey(String apikey) {
		this.apikey = apikey;
	}

	public String getMchid() {
		return mchid;
	}

	public void setMchid(String mchid) {
		this.mchid = mchid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

}