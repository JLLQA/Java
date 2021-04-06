package com.qa.day3;

import java.util.ArrayList;

public class PersonManager {
	
	private ArrayList<Person> people = new ArrayList<Person>();
	
	public void addPerson(Person p) {
		this.people.add(p);
	}
	
	//search person by name
	public void search(String searchName) {
		for(Person p : people) {
			if(p.getName().equals(searchName)) {
				System.out.println("found - " + p);
			}
			System.out.println("Sorry couldn't find");
		}
	}
}
