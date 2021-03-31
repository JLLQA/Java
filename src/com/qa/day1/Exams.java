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

	public static void Failed() {
		if ((phy * 100) / 150 < 60) {
			String Ans = "Student failed Physics";
			System.out.println(Ans);
		} 
		if ((chm * 100) / 150 < 60) {
			String Ans = "Student failed Chemistry";
			System.out.println(Ans);
		}
		if ((bio * 100) / 150 < 60) {
			String Ans = "Student failed Biology";
			System.out.println(Ans);
		}
		return;
	}
}
