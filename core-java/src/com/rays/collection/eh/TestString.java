package com.rays.collection.eh;

public class TestString {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "abc";

		String s3 = new String("abc");
		String s4 = new String("abc");

		Integer i = 100;

		// System.out.println(s1.equals(s2));
		// System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		// System.out.println(s1.equals(i));

		System.out.println(s3 == s4);
	}

}
