package com.qa.day3;

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

	public void personString() {
		System.out.println("Customer: " + this.name + " is " + this.age + " is a " + this.title);
	}
	
	public String getName() {
		return name;
	}
}
