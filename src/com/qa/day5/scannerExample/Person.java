package com.qa.day5.scannerExample;

public class Person {
	// private = safer
	private String name;
	private int age;
	private String title;

	public Person(String name, int age, String title) {
		this.name = name;
		this.age = age;
		this.title = title;
	}

	// Method 1
	@Override
	public String toString() {
		return String.format("name: %s%n" + "age: %d%n" + "job title %s", this.name, this.age, this.title);
	}

	// Method 2
	public void personString() {
		System.out.println("Customer: " + this.name + " is " + this.age + " is a " + this.title);
	}
	
	public String getName() {
		return name;
	}
}
