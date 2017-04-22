package com.vehicle.backoffice.entity;

import com.vehicle.backoffice.services.BoatEnum;
import com.vehicle.backoffice.services.BoatSizeEnum;

public class Boat {

	private String model;
	private BoatEnum type;
	private BoatSizeEnum size;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public BoatEnum getType() {
		return type;
	}
	public void setType(BoatEnum type) {
		this.type = type;
	}
	public BoatSizeEnum getSize() {
		return size;
	}
	public void setSize(BoatSizeEnum size) {
		this.size = size;
	}
	
}
