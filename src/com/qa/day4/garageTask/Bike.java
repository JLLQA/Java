package com.qa.day4.garageTask;

public class Bike extends Vehicle {
	private boolean stand = true;

	public Bike(String id, int doors, int wheels, int seats, int engineSize) {
		super(id, doors, wheels, seats, engineSize);
	}

	public void infoSheet() {
		System.out.println("Number of seats: " + super.getSeats() + ", Number of wheels: " + super.getWheels()
				+ ", Engine: " + super.getSize() + ", Bike stand: " + stand);
	}
}
