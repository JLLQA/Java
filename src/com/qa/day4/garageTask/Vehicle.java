package com.qa.day4.garageTask;

public abstract class Vehicle {
	
	private String id;
	private int doors;
	private int wheels;
	private int seats;
	private int engineSize;

	
	public Vehicle(String id, int doors, int wheels, int seats, int engineSize) {
		this.id = id;
		this.doors = doors;
		this.wheels = wheels;
		this.seats = seats;
		this.engineSize = engineSize;
	}

	public int getDoors() {
		return doors;
	}

	public int setDoors(int doors) {
		this.doors = doors;
		return this.doors;
	}
	
	public int getWheels() {
		return wheels;
	}

	public int setWheels(int wheels) {
		this.wheels = wheels;
		return this.wheels;
	}
	
	public int getSeats() {
		return seats;
	}

	public int setSeats(int seats) {
		this.seats = seats;
		return this.seats;
	}
	
	public int getSize() {
		return engineSize;
	}

	public int setSize(int engineSize) {
		this.engineSize = engineSize;
		return this.engineSize;
	}
	
	public String getId() {
		return id;
	}
	
	public String setId(String id) {
		this.id = id;
		return this.id;
	}
}
