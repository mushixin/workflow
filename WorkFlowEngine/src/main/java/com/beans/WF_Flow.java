package com.beans;

public class WF_Flow {
	private Integer no;
	private String name;
	private int startLimitRole;
	


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
	public int getStartLimitRole() {
		return startLimitRole;
	}
	public void setStartLimitRole(int startLimitRole) {
		startLimitRole = startLimitRole;
	}
	
	@Override
	public String toString() {
		return "WF_Flow [no=" + no + ", name=" + name + ", StartLimitRole=" + startLimitRole + "]";
	}

}
