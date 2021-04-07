package com.qa.day4.garageTask;

//import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>();

	private static DecimalFormat df = new DecimalFormat("0.00");

	public void addVehicle(Vehicle v) {
		this.vehicle.add(v);
	}

	public void subVehicle(Vehicle v) {
		this.vehicle.remove(v);
	}

	public void bill(Vehicle v) {
		System.out.println("Vehicle ID: " + v.getId());
		double dr = 79.99 * v.getDoors();
		System.out.println("Door replacement: £" + df.format(dr));
		double wr = 39.99 * v.getWheels();
		System.out.println("Wheel replacement: £" + df.format(wr));
		double sr = 24.50 * v.getSeats();
		System.out.println("Seat replacement: £" + df.format(sr));
		double er = 0.50 * v.getSize();
		System.out.println("Engine referbishment: £" + df.format(er));
		double total = dr + wr + sr + er;
		System.out.println("-----------------------");
		System.out.println("Total bill: £" + df.format(total));
		System.out.println("-----------------------");

	}

	// search vehicle by id
	public void search(String searchId) {
		for (Vehicle v : vehicle) {
			if (v.getId().equals(searchId)) {
				System.out.println("Found: " + v.getId());
			}
			System.out.println("Not found");
		}
	}

	public void clear() {
		vehicle.clear();
		System.out.println("cleared");
	}
}
