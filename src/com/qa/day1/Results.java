package com.qa.day1;

import java.util.Scanner;

public class Results {

	public static void main(String[] args) {

		Scanner test = new Scanner(System.in);
		System.out.println("Enter Physics result:");
		int a = test.nextInt();

		System.out.println("Enter Chemistry result:");
		int b = test.nextInt();

		System.out.println("Enter Biology result:");
		int c = test.nextInt();

		System.out.println("Select option:");
		System.out.println("Individual and total marks - 1");
		System.out.println("Overall exam percentage - 2");

		int z = test.nextInt();
		test.close();

		if (z == 1) {
			int aa = Exams.Total(a, b, c);
			System.out.println("Physics: " + a);
			System.out.println("Chemistry: " + b);
			System.out.println("Biology: " + c);
			System.out.println("Total marks:" + aa);
		} else if (z == 2) {
			double bb = Exams.Percentage(a, b, c);
			String temp = "Final %:" + bb + "%";
			System.out.println(temp);
		}

	}

}
