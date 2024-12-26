package com.rays.exception;

public class Account {

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposite(int amount) {
		this.balance += amount;
		System.out.println("after deposite: " + getBalance());
	}

	public void withdrawl(int amount) throws InsufficientBalanceException {

		if ((balance - amount) < 2000) {
			throw new InsufficientBalanceException("insufficient balance");
		} else {
			this.balance -= amount;
			System.out.println("after withdrawl: " + getBalance());
		}
	}

}
