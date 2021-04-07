package com.qa.day4.abstraction;

public class Dog extends Animal {

	@Override
	public void speak() {
		System.out.println("Bark");
	}

	@Override
	public void eat() {
		System.out.println("Bite bite");
	}

	public void walkies() {
		System.out.println("Let's go");
	}

}
