package com.vehicle.backoffice.controller;

import com.vehicle.backoffice.entity.Vehicle;
import com.vehicle.backoffice.entity.VehicleDetails;
import com.vehicle.backoffice.services.VehicleEnum;
import com.vehicle.backoffice.services.VehicleService;
import com.vehicle.backoffice.services.VehicleSpeedEnum;

public class VehicleDetailsController implements VehicleService {

	public VehicleDetails getDetails(Vehicle vehicle) {
		VehicleDetails details = new VehicleDetails();
		details.setVehicle(vehicle);
		
		if(vehicle.getAirplane() != null){
			details.setFloor(VehicleEnum.AIR);
			details.setSpeedMax((long) 809.5);
			details.setSpeedType(VehicleSpeedEnum.NODE);
		}else if(vehicle.getBicycle() != null){
			details.setFloor(VehicleEnum.EART);
			details.setSpeedMax((long) 100);
			details.setSpeedType(VehicleSpeedEnum.KM_H);
		}else if(vehicle.getBoat() != null){
			details.setFloor(VehicleEnum.SEA);
			details.setSpeedMax((long) 100);
			details.setSpeedType(VehicleSpeedEnum.NODE);			
		}else if(vehicle.getCars() != null){
			details.setFloor(VehicleEnum.EART);
			details.setSpeedMax((long) 250);
			details.setSpeedType(VehicleSpeedEnum.KM_H);
		}else if(vehicle.getTrain() != null){
			details.setFloor(VehicleEnum.RAIL);
			details.setSpeedMax((long) 300);
			details.setSpeedType(VehicleSpeedEnum.KM_H);
		}
		return details;
	}

}
