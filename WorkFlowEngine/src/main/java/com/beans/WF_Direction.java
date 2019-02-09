package com.beans;

public class WF_Direction {
	private Integer no;
	private int fromNode;
	private int toNode;
	

	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public int getFromNode() {
		return fromNode;
	}
	public void setFromNode(int fromNode) {
		this.fromNode = fromNode;
	}
	public int getToNode() {
		return toNode;
	}
	public void setToNode(int toNode) {
		this.toNode = toNode;
	}
	@Override
	public String toString() {
		return "WF_Direction [no=" + no + ", fromNode=" + fromNode + ", toNode=" + toNode + "]";
	}
}
