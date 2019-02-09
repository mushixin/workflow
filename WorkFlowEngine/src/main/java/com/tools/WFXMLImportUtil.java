package com.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.beans.Table_Node;
import com.beans.Table_Nodes;
import com.beans.WF_Direction;
import com.beans.WF_Directions;
import com.beans.WF_Flow;
import com.beans.WF_Node;
import com.beans.WF_Nodes;
import com.beans.WorkFlowDesp;

/**
 * 输入一个文件的路径，
 * 返回一个 WorkFlowDesp 对象
 * 表示把这个xml 流程描述数据转为一个对象。
 * @author Administrator
 *
 */
public class WFXMLImportUtil {
	
	/**
	 * 打开文件
	 * 读取文件为String
	 * 关闭文件
	 * @param path
	 * @return
	 */
	public static String readFromFile(String path){
		File file=new File(path);
		try {
			StringBuilder sb=new StringBuilder();
			BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(file) ));
			while(br.ready()){
				sb.append(br.readLine()).append("\n");	
			}
			br.close();
            
			return sb.toString();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return null;		
	}
	/**
	 * 解析xml字符串 为WorkFlowDesp
	 * @param wfDesp 工作流描述字符串。
	 * @return
	 */
	public static WorkFlowDesp change2Obj(String wfDesp){
		try {
			Document document = DocumentHelper.parseText(wfDesp);
			//</WorkFlowDesp>
		    Element root = document.getRootElement();

		    WorkFlowDesp wfd=new WorkFlowDesp();
		   //iterate through child elements 
		    for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
		        Element element = it.next();
			    switch(element.getName()){
			        case "WF_Flow":
			        	wfd.setWfFlow(getWF_Flow(element));
			        	break;
			        case "WF_Nodes":			        	
			        	wfd.setwFNodes(getWF_Nodes(element));
			        	break;
			        case "WF_Directions":
			        	wfd.setwFdirections(getWF_Directions(element));
			        	break;
			        case "Table_Nodes":	
			        	wfd.setTableNodes(getTable_Nodes(element));
			        	break;
		        }
		    }
		    return wfd;
		
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return null;
	}
	

	/*
	 * 从一个xml结点中解析出WF_Flow
	 */
	private static WF_Flow getWF_Flow(Element element){
		WF_Flow wf=new WF_Flow();
    	for (Iterator<Element> subit = element.elementIterator(); subit.hasNext();) {
    		Element wfsub=subit.next();
    		
    		switch(wfsub.getName()){
    		  case "No":wf.setNo(Integer.parseInt( wfsub.getText())); break;
    		  case "Name":wf.setName(wfsub.getText()); break;
    		  case "StartLimitRole":wf.setStartLimitRole(Integer.parseInt(wfsub.getText())); break;
    		}
    	}
    	return wf;
	}
	/*
	 * 从一个xml结点中解析出WF_Nodes
	 */
	private static WF_Nodes getWF_Nodes(Element element){
		WF_Nodes nodes=new WF_Nodes();
		for (Iterator<Element> subit = element.elementIterator(); subit.hasNext();) {
			//WF_Node
    		Element wfsub=subit.next();
    		nodes.addWFNode(getWF_Node(wfsub));
    	}
		return 	nodes;
	}
	
	
	private static WF_Node getWF_Node(Element element) {
		WF_Node node=new WF_Node();
		for (Iterator<Element> subit = element.elementIterator(); subit.hasNext();) {
    		Element wfsub=subit.next();
    		
    		switch(wfsub.getName()){
    		  case "No":node.setNo(Integer.parseInt(wfsub.getText() )); break;
    		  case "Name":node.setName(wfsub.getText()); break;
    		  // TODO 
//    		  case "StartLimitRole":node.setStartLimitRole(Integer.parseInt(wfsub.getText())); break;
    		  case "FocusField":node.setFocusField(wfsub.getText()); break;
    		}
    	}
		return node;
	}
	
	private static WF_Directions getWF_Directions(Element element) {
		WF_Directions directions=new WF_Directions();
		for (Iterator<Element> subit = element.elementIterator(); subit.hasNext();) {
			//WF_Node
    		Element wfsub=subit.next();
    		directions.addWF_Directions(getWF_Direction(wfsub));
    	}
		return directions;
	}
	
	private static WF_Direction getWF_Direction(Element element) {
		WF_Direction wfDirection=new WF_Direction();
		for (Iterator<Element> subit = element.elementIterator(); subit.hasNext();) {
    		Element wfsub=subit.next();
    		
    		switch(wfsub.getName()){
    		  case "No":wfDirection.setNo(Integer.parseInt(wfsub.getText())); break;
    		  case "FromNode":wfDirection.setFromNode(Integer.parseInt(wfsub.getText())); break;
    		  case "ToNode":wfDirection.setToNode(Integer.parseInt(wfsub.getText())); break;
    		}
    	}
		return wfDirection;
	}
	private static Table_Nodes getTable_Nodes(Element element) {
		Table_Nodes nodes=new Table_Nodes();
		for (Iterator<Element> subit = element.elementIterator(); subit.hasNext();) {
			//WF_Node
    		Element wfsub=subit.next();
    		nodes.addTableNode(getTable_Node(wfsub));
    	}
		
		return nodes;
	}

	private static Table_Node getTable_Node(Element element) {
		Table_Node node=new Table_Node();
		for (Iterator<Element> subit = element.elementIterator(); subit.hasNext();) {
    		Element wfsub=subit.next();
    		
    		switch(wfsub.getName()){
    		  case "No":node.setNo(Integer.parseInt(wfsub.getText())); break;
    		  case "Name":node.setName(wfsub.getText()); break;
    		  case "Type":node.setType(wfsub.getText()); break;
    		  case "UIWidth":node.setuIWidth(Integer.parseInt(wfsub.getText() )); break;
    		  case "UIHeight":node.setuIHeight(Integer.parseInt(wfsub.getText() )); break;
    		  case "MinLen":node.setMinLen(Integer.parseInt(wfsub.getText() )); break;
    		  case "MaxLen":node.setMaxLen(Integer.parseInt(wfsub.getText() )); break;
    		}
    	}
		
		return node;
	}
	
	
	public static void main(String[] args) {
		String str=readFromFile("C:\\Users\\Administrator\\Desktop\\myworkflow.xml");
		WorkFlowDesp desp=change2Obj(str);
		System.out.println(desp);
		return;
	}

}
