package com.vehicle.backoffice.impl;


import com.vehicle.backoffice.entity.Vehicle;
import com.vehicle.backoffice.entity.VehicleDetails;
import com.vehicle.backoffice.services.VehicleService;

public class VehicleServiceImpl implements VehicleService {

	public VehicleDetails getDetails(Vehicle vehicle) {
		VehicleDetails vehicleDetail = new VehicleDetails();
		vehicleDetail.setVehicle(vehicle);
		return null;
	}

}
