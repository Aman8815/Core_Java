package com.rays.collection.eh;

import java.util.HashSet;
import java.util.Set;

public class TestEqualSet {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "aman", 1000);

		Employee e2 = new Employee(1, "aman", 1000);

		Employee e3 = new Employee(3, "xyz", 1100);

		Set set = new HashSet();

		set.add(e1);
		set.add(e2);
		set.add(e3);
		System.out.println(set);

		set.remove(e2);
		System.out.println(set);

		System.out.println(set.contains(e2));

	}

}
