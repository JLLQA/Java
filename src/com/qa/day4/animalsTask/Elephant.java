package com.qa.day4.animalsTask;

public class Elephant extends Animal {
	private int tusks = 2;

	public void infoSheet() {
		System.out.println("Number of tusks: " + this.tusks
				+ ", Tail: " + super.getTail() + ", Number of legs: " + super.getLegs());
	}
	
	public void ears() {
		System.out.println("My ears are huuuuuuuuuge");
	}
	
	@Override
	public void noise() {
		System.out.println("I make elephant noises");
	}

}
