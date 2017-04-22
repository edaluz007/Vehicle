package com.vehicle.backoffice.entity;

import com.vehicle.backoffice.services.CarsEnum;

public class Cars {
	
	private String model;
	private CarsEnum type;
	private String mark;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public CarsEnum getType() {
		return type;
	}
	public void setType(CarsEnum type) {
		this.type = type;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}	
}
