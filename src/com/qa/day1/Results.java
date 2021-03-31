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

		Exams.phy = a;
		Exams.chm = b;
		Exams.bio = c;

		System.out.println(
				"Select option:" + "\n" + "Individual and total marks - 1" + "\n" + "Overall exam percentage - 2");

		int z = test.nextInt();
		test.close();

		if (z == 1) {
			String out = "Physics: " + a + "\n" + "Chemistry: " + b + "\n" + "Biology: " + c + "\n" + "Total marks: "
					+ Exams.Total() + "\n";
			System.out.println(out);
		} else if (z == 2) {
			String out = "Average Percentage:" + Exams.Percentage() + "%";
			System.out.println(out);
			if (Exams.Percentage() < 60) {
				Exams.Failed();
			} else if ((a * 100) / 150 < 60) {
				System.out.println("Student failed Physics");
			} else if ((b * 100) / 150 < 60) {
				System.out.println("Student failed Chemistry");
			} else if ((c * 100) / 150 < 60) {
				System.out.println("Student failed Biology");
			} else {
				System.out.println("Student passed");
			}
		}

	}
}
