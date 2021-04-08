package com.qa.day5.staticTest;

public class Person {
	private String name;
	private String eyeColour;

	public static int numberOfPeople;

	public Person(String name, String colour) {
		this.name = name;
		this.eyeColour = colour;
		numberOfPeople++;
	}

	// Getters and Setters

	public static void setNumOfPeople(int numPeople) {
		Person.numberOfPeople = numPeople;
	}
}