package com.qa.day7.Singleton;

public class Main {

	public static void main(String[] args) {

		Manchester X1 = Manchester.createObject();
		Manchester X2 = Manchester.createObject();
		Manchester X3 = Manchester.createObject();

		X1.data = 99;
		System.out.println(X1.data);
		System.out.println(X2.data);
		System.out.println(X3.data);
	}

}
