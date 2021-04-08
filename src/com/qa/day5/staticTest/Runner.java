package com.qa.day5.staticTest;

public class Runner {

	public static void main(String[] args) {
		Person chris = new Person("Chris", "Blue");

		Person tom = new Person("Tom", "Brown");

		Person.setNumOfPeople(0);

		Person stephan = new Person("Stephan", "Greenish-Brownish-Blueish");

		System.out.println(Person.numberOfPeople);
	}

}
