package com.rays.collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {

		Set set = new HashSet();

		set.add(100);
		set.add(200);
		set.add("one");
		set.add("two");
		set.add("two");
		set.add(null);
		set.add(null);

		System.out.println(set);

	}

}
