package com.qa.day5.scannerExample;

import java.util.Scanner;

public class Calculator {

	public static void calc() {

		Scanner num = new Scanner(System.in);
		System.out.println("Select first number:");
		int a = num.nextInt();

		System.out.println("Select second number:");
		int b = num.nextInt();

		// operator check
		int op = 0;
		System.out.println("Select operator:");
		System.out.println("Addition = 1");
		System.out.println("Subtraction = 2");
		System.out.println("Multiplication = 3");
		System.out.println("Division = 4");

		int c = num.nextInt();
		do {
			if (c == (int) c) {
				if (c <= 4 && c >= 1) {
					op = 1;
				} else {
					System.out.println("Please enter a correct operator:");
					System.out.println("Addition = 1");
					System.out.println("Subtraction = 2");
					System.out.println("Multiplication = 3");
					System.out.println("Division = 4");
					c = num.nextInt();
				}
			} else {
				System.out.println("Please enter a operator");
				System.out.println("Addition = 1");
				System.out.println("Subtraction = 2");
				System.out.println("Multiplication = 3");
				System.out.println("Division = 4");
				c = num.nextInt();
			}
		} while (op == 0);

		num.close();

		// Calculator
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
			if (a < b) {
				System.out.println("Division cannot be performed");
			} else {
				double dd = Operators.Division(a, b);
				System.out.println(dd);
			}
		}
	}
}
