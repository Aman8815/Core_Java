package com.rays.collection.eh;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "aman", 1000);

		Employee e2 = new Employee(1, "aman", 1000);

		Employee e3 = new Employee(3, "xyz", 1100);
		
		System.out.println(e1.hashCode());
		
		System.out.println(e2.hashCode());

		System.out.println(e1.equals(e2));

	}

}
