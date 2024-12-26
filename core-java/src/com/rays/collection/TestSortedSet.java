package com.rays.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {

	public static void main(String[] args) {

		SortedSet set = new TreeSet();

		set.add(200);
		set.add(100);
		set.add(700);
		set.add(500);
		set.add(400);
		set.add(300);
		set.add(600);
		set.add(800);

		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet(200));
		System.out.println(set.tailSet(200));
		System.out.println(set.subSet(200, 800));
	}
}
