package com.gsccs.plat.bass;

/**
 * 透视表字段
 * 
 * @author x.d zhang
 * 
 */
public class DatagridColumn {

	private String field;
	private String title;
	private Integer width;
	private String align = Align.LEFT.type;
	private Integer colspan;
	private Integer rowspan;
	private boolean hidden = false;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getColspan() {
		return colspan;
	}

	public void setColspan(Integer colspan) {
		this.colspan = colspan;
	}

	public Integer getRowspan() {
		return rowspan;
	}

	public void setRowspan(Integer rowspan) {
		this.rowspan = rowspan;
	}

	
	public String getAlign() {
		return align;
	}

	public void setAlign(String align) {
		this.align = align;
	}

	

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}



	public static enum Align {
		LEFT("left"), CENTER("center"), RIGHT("right");

		private final String type;

		private Align(String type) {
			this.type = type;
		}

		public String getType() {
			return type;
		}
	}

}
