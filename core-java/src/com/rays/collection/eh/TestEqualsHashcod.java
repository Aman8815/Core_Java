package com.rays.collection.eh;

import java.util.ArrayList;
import java.util.List;

public class TestEqualsHashcod {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "aman", 1000);

		Employee e2 = new Employee(1, "aman", 1000);

		Employee e3 = new Employee(3, "xyz", 1100);

		List list = new ArrayList();

		list.add(e1);
		list.add(e3);

		System.out.println(list);
		
		System.out.println(list.contains(e2));

	}

}
