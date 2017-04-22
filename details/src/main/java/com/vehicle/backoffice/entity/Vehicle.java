package com.vehicle.backoffice.entity;

public class Vehicle {
	
	private Cars cars;
	private Moto moto;
	private Bicycle bicycle;
	private Train train;
	private Boat boat;
	private Airplane airplane;
	
	
	public Cars getCars() {
		return cars;
	}
	public void setCars(Cars cars) {
		this.cars = cars;
	}
	public Moto getMoto() {
		return moto;
	}
	public void setMoto(Moto moto) {
		this.moto = moto;
	}
	public Bicycle getBicycle() {
		return bicycle;
	}
	public void setBicycle(Bicycle bicycle) {
		this.bicycle = bicycle;
	}
	public Train getTrain() {
		return train;
	}
	public void setTrain(Train train) {
		this.train = train;
	}
	public Boat getBoat() {
		return boat;
	}
	public void setBoat(Boat boat) {
		this.boat = boat;
	}
	public Airplane getAirplane() {
		return airplane;
	}
	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}
}
