package com.qa.day6.exceptions;

public class Main {

	public static void main(String[] tree) {

		HSBC bank = new HSBC();
		try {
			bank.SalarySlip(2000, 1);
		} catch (AbsentiesException E) {
			System.out.println("Thats fine");
		}

	}

}
