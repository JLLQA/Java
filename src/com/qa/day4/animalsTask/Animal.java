package com.qa.day4.animalsTask;

public class Animal {

	private boolean fur = true;
	private boolean tail = true;
	private int legs = 4;

	public void noise() {
		System.out.println("I growl");
	}

	public void move() {
		System.out.println("I walk");
	}

	// getters
	public boolean getFur() {
		return fur;
	}

	public boolean getTail() {
		return tail;
	}
	
	public int getLegs() {
		return legs;
	}

	// setters
	public void setFur(boolean newValueOfFur) {
		this.fur = newValueOfFur;
	}

	public void setTail(boolean newValueOfTail) {
		this.tail = newValueOfTail;
	}
	
	public void setLegs(int newValueOfLegs) {
		this.legs = newValueOfLegs;
	}

}
