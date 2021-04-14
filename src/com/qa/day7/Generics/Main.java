package com.qa.day7.Generics;

public class Main {

	public static void main(String[] args) {

		Test<Integer> ref1 = new Test<Integer>();
		Test<String> ref2 = new Test<String>();

		ref1.msg(234);
		ref2.msg("Jordan");
	}

	class boom {

	}

}
