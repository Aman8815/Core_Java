package com.rays.constructorcalling;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		
		Employee e = new Employee("abc", "xyz", "indore");
		
		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		System.out.println(e.getAddress());
		
		
	}

}
