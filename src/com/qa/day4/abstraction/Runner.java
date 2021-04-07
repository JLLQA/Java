package com.qa.day4.abstraction;

public class Runner {

	public static void main(String[] args) {

		Elephant dumbo = new Elephant();
		System.out.println("---dumbo the elephant---");
		dumbo.eat();
		dumbo.hungry();
		dumbo.speak();
		dumbo.walkies();

		Dog fido = new Dog();
		System.out.println("---fido the dog---");
		fido.eat();
		fido.hungry();
		fido.speak();
		fido.walkies();

		// cannot make an instance of an ABSTRACT class
		// Animal a = new Animal();
		Animal a = new Dog();
		a.eat();

	}

}
