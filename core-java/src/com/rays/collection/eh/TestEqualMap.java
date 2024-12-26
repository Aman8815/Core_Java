package com.rays.collection.eh;

import java.util.HashMap;
import java.util.Map;

public class TestEqualMap {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "aman", 1000);

		Employee e2 = new Employee(1, "aman", 1000);

		Employee e3 = new Employee(3, "xyz", 1100);

		Map map = new HashMap();

		map.put(e1, "Aman");
		map.put(e2, "Abhi");
		map.put(e3, "Abhi");
		System.out.println(map);
		map.remove(e2);
		System.out.println(map);

	}

}
