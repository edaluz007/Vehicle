package com.vehicle.backoffice.entity;

import com.vehicle.backoffice.services.TrainEnum;

public class Train {
	
	private String model;
	private TrainEnum type;
	private String route;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public TrainEnum getType() {
		return type;
	}
	public void setType(TrainEnum type) {
		this.type = type;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
}
