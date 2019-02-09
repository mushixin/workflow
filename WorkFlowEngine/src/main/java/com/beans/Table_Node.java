package com.beans;

public class Table_Node {
	private Integer no;
	private String name;
	private String type;
	private Integer uIWidth;
	private Integer uIHeight;
	private Integer minLen;
	private Integer maxLen;

	
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getuIWidth() {
		return uIWidth;
	}
	public void setuIWidth(Integer uIWidth) {
		this.uIWidth = uIWidth;
	}
	public Integer getuIHeight() {
		return uIHeight;
	}
	public void setuIHeight(Integer uIHeight) {
		this.uIHeight = uIHeight;
	}
	public Integer getMinLen() {
		return minLen;
	}
	public void setMinLen(Integer minLen) {
		this.minLen = minLen;
	}
	public Integer getMaxLen() {
		return maxLen;
	}
	public void setMaxLen(Integer maxLen) {
		this.maxLen = maxLen;
	}
	@Override
	public String toString() {
		return "Table_Node [myPK=" + no + ", name=" + name + ", type=" + type + ", uIWidth=" + uIWidth + ", uIHeight="
				+ uIHeight + ", minLen=" + minLen + ", maxLen=" + maxLen + "]";
	}
	
}
