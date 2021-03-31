package com.qa.day1;
import java.util.Scanner;

public class Results {

	public static void main(String[] args) {

		Scanner test1 = new Scanner(System.in);
		System.out.println("Enter Physics result:");
		int a = test1.nextInt();
		
		Scanner test2 = new Scanner(System.in);
		System.out.println("Enter Chemistry result:");
		int b = test2.nextInt();
		
		Scanner test3 = new Scanner(System.in);
		System.out.println("Enter Biology result:");
		int c = test3.nextInt();
		
		Scanner methods = new Scanner(System.in);
		System.out.println("Select option:");
		System.out.println("Individual and total marks - 1");
		System.out.println("Overall exam percentage - 2");
		int z = methods.nextInt();
	
		if (z == 1)
			Exams.Total(a, b, c);
			else if (z == 2)
				Exams.Percentage(a, b, c);
		
	}

}
