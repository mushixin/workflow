package com.beans;

import java.util.ArrayList;
import java.util.List;

public class WF_Nodes {
	private List<WF_Node> wFNodes;

	public WF_Nodes() {
		super();
		this.wFNodes = new ArrayList<WF_Node>();
	}
	public void addWFNode(WF_Node node){
		wFNodes.add(node);
	}
	public List<WF_Node> getwFNodes() {
		return wFNodes;
	}

	public void setwFNodes(List<WF_Node> wFNodes) {
		this.wFNodes = wFNodes;
	}
	
}
