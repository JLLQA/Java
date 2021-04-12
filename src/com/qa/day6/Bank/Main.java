package com.qa.day6.Bank;

public class Main {

	public static void main(String[] args) {

		Bank natwest = new Bank();
		natwest.deposit(200);
		natwest.deposit(500);
		natwest.showBalance();
		try {
			natwest.withDraw(3000);
		} catch (WithdrawException R) {
			System.out.println("We can help");
		}
		
		Bank lloyds = new Bank();
		lloyds.deposit(100);
		lloyds.showBalance();
		try {
			lloyds.withDraw(500);
		} catch (WithdrawException R) {
			System.out.println("Not allowed");
		}

	}

}
