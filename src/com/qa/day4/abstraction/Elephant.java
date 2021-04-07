package com.qa.day4.abstraction;

public class Elephant extends Animal {

	@Override
	public void speak() {
		System.out.println("Elephant noises");
	}

	@Override
	public void eat() {
		System.out.println("Nom nom nom");
	}

}
