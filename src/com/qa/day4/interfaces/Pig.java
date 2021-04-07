package com.qa.day4.interfaces;

public class Pig implements Animal{
	
	@Override
	public void speak() {
		System.out.println("Oink");
	}

	@Override
	public void sleep() {
		System.out.println("Zzzzzzz");
	}

}
