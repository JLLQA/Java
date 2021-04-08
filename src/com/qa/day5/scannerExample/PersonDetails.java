package com.qa.day5.scannerExample;

import java.util.ArrayList;
import java.util.Scanner;

import com.qa.day3.Person;
import com.qa.day3.PersonManager;

public class PersonDetails {
	public static void Details() {
		Scanner details = new Scanner(System.in);
		System.out.println("Please enter name: ");
		String a = details.nextLine();
		
		System.out.println("Please enter age: ");
		int b = details.nextInt();
		details.nextLine();
		
		System.out.println("Please enter job: ");
		String c = details.nextLine();
		
		details.close();
		
		Person p1 = new Person(a, b, c);
		Person p2 = new Person("Sammy", 6, "Goverment");
		Person p3 = new Person("Luke", 69, "Devops");
		Person p4 = new Person("Dan", 27, "Rower");

		// Method 2
		p1.personString();
		p2.personString();

		// specify the data type of what you want to store
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
