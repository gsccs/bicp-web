package com.gsccs.cmcc.product.model;


/**
 * 产品信息 
 * @author x.d zhang
 *
 */
public class Product {

	private String id;
	private String title;
	private String remark;
	private String status;
	private String issem;
	private String ismodi;

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

	public String getRemark() {
		return remark;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public String getIssem() {
		return issem;
	}

	public void setIssem(String issem) {
		this.issem = issem;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getIsmodi() {
		return ismodi;
	}

	public void setIsmodi(String ismodi) {
		this.ismodi = ismodi;
	}
	
	

}