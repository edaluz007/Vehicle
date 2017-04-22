package com.vehicle.backoffice.services;

import com.vehicle.backoffice.entity.Vehicle;
import com.vehicle.backoffice.entity.VehicleDetails;

public interface VehicleService {

	public VehicleDetails getDetails(Vehicle vehicle);
}
