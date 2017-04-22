package com.vehicle.backoffice.entity;

import com.vehicle.backoffice.services.VehicleEnum;
import com.vehicle.backoffice.services.VehicleSpeedEnum;

public class VehicleDetails {

	private Vehicle vehicle;
	private VehicleEnum floor;
	private VehicleSpeedEnum speedType;
	private long speedMax;

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public VehicleEnum getFloor() {
		return floor;
	}

	public void setFloor(VehicleEnum floor) {
		this.floor = floor;
	}

	public VehicleSpeedEnum getSpeedType() {
		return speedType;
	}

	public void setSpeedType(VehicleSpeedEnum speedType) {
		this.speedType = speedType;
	}

	public long getSpeedMax() {
		return speedMax;
	}

	public void setSpeedMax(long speedMax) {
		this.speedMax = speedMax;
	}
}
