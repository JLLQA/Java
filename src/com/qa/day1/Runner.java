package com.qa.day1;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		int age = 25;
		System.out.println(age);
		
		String a = "hi";

		//shortcut: sysout then cotrl + space
		
		Hello.runall();
		
		Hello.h1();
		Hello.h2(" Tim");
		Hello.h3("John", " Smith");
		Hello.h4();
		Hello.h5();
		
		//class names are in PascalCase
		//variables are named in camelCase
		int num = 4;
		String str ="Hiiii";
		float price = 5.99f;
		boolean bool = true;
		char myLetter = 'd';
		double doub = 232;
		long l = 641;
	}

}
