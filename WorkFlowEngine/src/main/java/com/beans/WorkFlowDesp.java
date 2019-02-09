package com.beans;

public class WorkFlowDesp {
    private Table_Nodes tableNodes;
    private WF_Directions wFdirections;
    private WF_Nodes wFNodes;
    private WF_Flow wfFlow;
    
	public Table_Nodes getTableNodes() {
		return tableNodes;
	}
	public void setTableNodes(Table_Nodes tableNodes) {
		this.tableNodes = tableNodes;
	}
	public WF_Directions getwFdirections() {
		return wFdirections;
	}
	public void setwFdirections(WF_Directions wFdirections) {
		this.wFdirections = wFdirections;
	}
	public WF_Nodes getwFNodes() {
		return wFNodes;
	}
	public void setwFNodes(WF_Nodes wFNodes) {
		this.wFNodes = wFNodes;
	}
	public WF_Flow getWfFlow() {
		return wfFlow;
	}
	public void setWfFlow(WF_Flow wfFlow) {
		this.wfFlow = wfFlow;
	}
	@Override
	public String toString() {
		return "WorkFlowDesp [tableNodes=" + tableNodes + ", wFdirections=" + wFdirections + ", wFNodes=" + wFNodes
				+ ", wfFlow=" + wfFlow + "]";
	}
    
}
