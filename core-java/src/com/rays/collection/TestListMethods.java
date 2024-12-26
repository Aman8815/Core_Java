package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestListMethods {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(100);
		list.add("one");
		list.add(100.123);
		list.add(true);
		list.add('n');
		list.add("two");

		System.out.println("list => " + list);

		list.add(2, "two");

		System.out.println("list => " + list);

		System.out.println(list.get(2));

		list.remove(2);

		System.out.println("list => " + list);

		list.set(2, "two");

		System.out.println("list => " + list);

		System.out.println(list.indexOf("two"));
		
		System.out.println(list.lastIndexOf("two"));
		
		System.out.println("list => " + list.subList(1, 4));

	}
}
