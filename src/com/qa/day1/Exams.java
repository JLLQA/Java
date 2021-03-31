package com.qa.day1;

public class Exams {

	static int phy;
	static int chm;
	static int bio;

	public static int Total() {
		int Ans = (phy + chm + bio);
		return Ans;
	}

	public static double Percentage() {
		double Ans = (Total() * 100) / 450;
		return Ans;
	}
}
