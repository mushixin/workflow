package com.beans;

import java.util.ArrayList;
import java.util.List;

public class Table_Nodes {
	private List<Table_Node> tableNodes;

	public Table_Nodes() {
		super();
		tableNodes=new ArrayList<Table_Node>();
	}
	
	public Table_Nodes(List<Table_Node> tableNodes) {
		super();
		this.tableNodes = tableNodes;
	}
	
	public void addTableNode(Table_Node node){
		tableNodes.add(node);
	}
}
