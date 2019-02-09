package com.beans;

import java.util.ArrayList;
import java.util.List;

public class WF_Directions {
	private List<WF_Direction> wFDirections;

	public WF_Directions() {
		super();
		wFDirections=new ArrayList<>();
	}
	
	public WF_Directions(List<WF_Direction> wFDirections) {
		super();
		this.wFDirections = wFDirections;
	}
	public void addWF_Directions(WF_Direction wFDirection) {
		wFDirections.add(wFDirection);
	}

	public List<WF_Direction> getwFDirections() {
		return wFDirections;
	}

	public void setwFDirections(List<WF_Direction> wFDirections) {
		this.wFDirections = wFDirections;
	}

	@Override
	public String toString() {
		return "WF_Directions [wFDirections=" + wFDirections + "]";
	}
	
}
