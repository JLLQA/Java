package com.qa.day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("Select first number:");
		int a = num.nextInt();

		System.out.println("Select second number:");
		int b = num.nextInt();

		System.out.println("Select operator:");
		System.out.println("Addition = 1");
		System.out.println("Subtraction = 2");
		System.out.println("Multiplication = 3");
		System.out.println("Division = 4");

		int c = num.nextInt();

		System.out.println("Answer:");

		if (c == 1) {
			int aa = Operators.Addition(a, b);
			System.out.println(aa);
		} else if (c == 2) {
			int bb = Operators.Subtraction(a, b);
			System.out.println(bb);

		} else if (c == 3) {
			int cc = Operators.Multiplication(a, b);
			System.out.println(cc);

		} else if (c == 4) {
			double dd = Operators.Division(a, b);
			System.out.println(dd);

		}

	}

}
