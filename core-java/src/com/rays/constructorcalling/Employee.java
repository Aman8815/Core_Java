package com.rays.constructorcalling;

public class Employee extends Person {

	private String address;

	public Employee() {
		System.out.println("Person Deafult Constructor");
	}

	public Employee(String address) {
		this.address = address;
	}
	
	public Employee(String firstName ,String lastName,String address) {
		super(firstName,lastName);
		this.address = address;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
