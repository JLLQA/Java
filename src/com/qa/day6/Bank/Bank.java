package com.qa.day6.Bank;

public class Bank {

	int balance;

	public void deposit(int amo) {
		balance += amo;
	}

	public void showBalance() {
		System.out.println("Your current balance: " + balance);
	}

	public void withDraw(int amo) throws WithdrawException {
		if (amo > balance) {
			WithdrawException E = new WithdrawException();
			throw E;
		} else {
			balance -= amo;
		}
	}

}
