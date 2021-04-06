package com.qa.day2;

public class Iterations {

	public static void forloop(int inp) {
		for (int count = 0; count < inp + 1; count++) {
			System.out.println(inp);
		}
	}

	public static void whileloop() {
		int num = 3;
		while (num < 3) {
			num++;
			System.out.println(num);
		}
	}

	public static void dowhile() {
		int val = 1;
		int i = 1;
		do {
			val++;
			System.out.println("Loop " + i);
			i++;
		} while (val < 3);
	}

	public static void flow1(int A) {
		for (int q = A; q < 201; q++) {
			System.out.println(q);
		}

	}

	public static void flow2(int A) {

	}


}
