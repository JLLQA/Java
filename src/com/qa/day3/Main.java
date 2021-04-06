package com.qa.day3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Sam", 18, "Engineer");
		Person p2 = new Person("Sammy", 6, "Goverment");
		Person p3 = new Person("Luke", 69, "Devops");
		Person p4 = new Person("Dan", 27, "Rower");

		// Method
		System.out.println(p1);

		// Method 2
		p2.personString();

		//specify the data type of what you want to store
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);

		PersonManager manager = new PersonManager();
		manager.addPerson(p1);
		manager.addPerson(p2);
		manager.addPerson(p3);
		manager.addPerson(p4);
		
		manager.search("william");

	}

}
