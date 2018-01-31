package com.gsccs.plat.bass;

/**
 * 透视表字段
 * 
 * @author x.d zhang
 * 
 */
public class PropgridRow {

	private String name;
	private String value;
	private String group;
	private Object editor;
	
	private String productid;
	private String corpid;
	private String propid;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public Object getEditor() {
		return editor;
	}

	public void setEditor(Object editor) {
		this.editor = editor;
	}

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getCorpid() {
		return corpid;
	}

	public void setCorpid(String corpid) {
		this.corpid = corpid;
	}

	public String getPropid() {
		return propid;
	}

	public void setPropid(String propid) {
		this.propid = propid;
	}
	
	

}
