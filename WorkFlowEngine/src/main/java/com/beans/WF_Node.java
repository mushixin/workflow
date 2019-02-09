package com.beans;

public class WF_Node {
	private Integer no;
	private String name;
	private String focusField;
	

	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String nodeName) {
		this.name = nodeName;
	}
	public String getFocusField() {
		return focusField;
	}
	public void setFocusField(String focusField) {
		this.focusField = focusField;
	}
	@Override
	public String toString() {
		return "WF_Node [no=" + no + ", nodeName=" + name + ", focusField=" + focusField + "]";
	}
}
