package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionRetainAll {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();

		c1.add(100);
		c1.add("one");
		c1.add(100.123);
		c1.add(true);
		c1.add('n');
		c1.add('a');

		Collection c2 = new ArrayList();

		c2.add(100);
		c2.add("one");
		c2.add(true);
		c2.add('a');
		c2.add(200);

		System.out.println("c1 => " + c1);
		System.out.println("c2 => " + c2);

		c1.retainAll(c2);

		System.out.println("c1 => " + c1);
		
		System.out.println("c1 size => " + c1.size());
	}
}
