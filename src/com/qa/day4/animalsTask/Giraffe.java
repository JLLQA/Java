package com.qa.day4.animalsTask;

public class Giraffe extends Animal{
	
private int neck = 30;

	public void infoSheet() {
		System.out.println("Neck length: " + this.neck
				+ ", Tail: " + super.getTail() + ", Number of legs: " + super.getLegs());
	}
	
	public void spots() {
		System.out.println("I am covered in leopard print");
	}
	
}
