package com.vehicle.backoffice.entity;

import com.vehicle.backoffice.services.BicycleEnum;

public class Bicycle {

	private String mark;
	private BicycleEnum type;
	private boolean change;
	
	
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public BicycleEnum getType() {
		return type;
	}
	public void setType(BicycleEnum type) {
		this.type = type;
	}
	public boolean isChange() {
		return change;
	}
	public void setChange(boolean change) {
		this.change = change;
	}
	
}
