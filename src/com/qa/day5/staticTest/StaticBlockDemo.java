package com.qa.day5.staticTest;

import java.util.List;
import java.util.LinkedList;

public class StaticBlockDemo {
	public static List<String> languages = new LinkedList<>();

	static {
		languages.add("Java");
		languages.add("C++");
		languages.add("Python");
	}

	static {
		languages.add("HTML");
		languages.add("Groovy");
	}
}
