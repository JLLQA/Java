package com.qa.day4.abstraction;

public abstract class Animal {

	// no details for the method
	abstract public void speak();

	abstract public void eat();

	public void hungry() {
		System.out.println("Feed me");
	}

	public void walkies() {
		System.out.println("This is in the base class");
	}

}
