package com.rays.collection.comaparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(3, "aman", 1000);

		Employee e2 = new Employee(2, "ajeet", 2000);

		Employee e3 = new Employee(1, "xyz", 1100);
		
		Employee e4 = new Employee(1, "bbb", 1100);

		List list = new ArrayList();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			Employee employee = (Employee) it.next();

			System.out.println(employee);

		}

	}

}
