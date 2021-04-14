package com.qa.day7.Singleton;

public class Manchester {

	static Manchester x;
	int data;

	private Manchester() {

	}

	public void msg() {
		System.out.println("hello");
	}

	public static Manchester createObject() {
		if (x == null) {
			x = new Manchester();
		}
		return x;
	}

}
