package com.rays.oop.deep;

public class Customer implements Cloneable {

	public String name;

	public Account account;

	public Customer(String name, int balance) {
		this.name = name;
		this.account = new Account(balance);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Customer customer = (Customer) super.clone();

		customer.account = (Account) this.account.clone();

		return customer;
	}
}
