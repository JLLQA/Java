package com.qa.day4.garageTask;

public class Runner {

	public static void main(String[] args) {
		Car car = new Car("2319a", 3, 4, 5, 500);
		System.out.println("---This is my car---");
		car.infoSheet();
		System.out.println(" ");

		Bike bike = new Bike("5412a", 0, 2, 1, 200);
		System.out.println("---This is my bike---");
		bike.infoSheet();
		System.out.println(" ");

		Tank tank = new Tank("sr71", 1, 8, 3, 4000);
		System.out.println("---This is my tank---");
		tank.infoSheet();
		System.out.println(" ");

		Garage garage = new Garage();
		garage.addVehicle(car);
		garage.addVehicle(bike);
		garage.addVehicle(tank);

		garage.bill(car);
		System.out.println(" ");
		garage.bill(bike);
		System.out.println(" ");
		garage.bill(tank);
		System.out.println(" ");

		garage.search("car");
		
		//garage.clear();
	}

}
