package com.qa.day1;

public class Exams {
	
	public static void Total(int a, int b, int c) {
		System.out.println("Physics: " + a);
		System.out.println("Chemistry: " + b);
		System.out.println("Biology: " + c);
		System.out.println("Total marks:" + (a + b + c));
	}
	
	public static void Percentage(double a, double b, double c) {
		System.out.println("Final %: " + ((a + b + c) / 450) * 100 + "%");
	}
}
