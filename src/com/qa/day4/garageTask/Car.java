package com.qa.day4.garageTask;

public class Car extends Vehicle {
	private boolean cruiseControl = true;

	public Car(String id, int doors, int wheels, int seats, int engineSize) {
		super(id, doors, wheels, seats, engineSize);
	}

	public void infoSheet() {
		System.out.println("Number of seats: " + super.getSeats() + ", Number of wheels: " + super.getWheels()
				+ ", Engine: " + super.getSize() + ", Cruise control: " + cruiseControl);
	}
	
}
