package com.qa.day4.animalsTask;

public class Rhino extends Animal {

	private boolean horn = true;
	
	public void infoSheet() {
		System.out.println("Horn: " + this.horn
				+ ", Tail: " + super.getTail() + ", Number of legs: " + super.getLegs());
	}
	
	@Override
	public void move() {
		System.out.println("I charge");
	}
	public void skin() {
		System.out.println("My hide is thick");
	}
}
