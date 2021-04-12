package com.qa.day6.exceptions;

public class HSBC {

	public void SalarySlip(int salary, int absenties) throws AbsentiesException {
		float tax = salary * 30 / 100;
		try {
			if (absenties > 10) {
				AbsentiesException ref = new AbsentiesException();
				throw ref;
			}
		} catch (AbsentiesException t) {
			System.out.println("too many");
		}
		System.out.println("Your tax is: " + tax);
	}
}
