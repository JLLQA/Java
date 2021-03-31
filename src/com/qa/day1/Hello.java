package com.qa.day1;

public class Hello {
	
	public static void method1() {
		System.out.println("method1");
	}

	public static void method2() {
		System.out.println("method2");
	}
	
	public static void method3() {
		System.out.println("method3");
	}
	
	public static void runall() {
		method1();
		method2();
		method3();
	}
	
	public static void h1() {
		System.out.println("Hello world - h1");
	}
	
	public static void h2(String name) {
		System.out.println("Hello world" + name);
	}
	
	public static void h3(String fname, String sname) {
		System.out.println("Hello " + fname + sname);
	}
	public static void h4() {
		String name = " bob";
		System.out.println("Hello world" + name);
	}
	
	public static String h5() {
		System.out.println("h5");
		return "Hello world - return";
	}
}
