package com.rays.exception;

public class TestAccount {

	public static void main(String[] args) {

		Account account = new Account();

		account.setBalance(1000);

		account.deposite(5000);

		try {
			account.withdrawl(4001);
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
		
		account.deposite(5000);
		
		System.out.println(account.getBalance());

	}

}
