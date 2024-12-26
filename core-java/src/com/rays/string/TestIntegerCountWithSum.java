package com.rays.string;

public class TestIntegerCountWithSum {

	public static void main(String[] args) {

		String name = "Am1an2Yas3hona4";

		int sum = 0;

		for (int i = 0; i < name.length(); i++) {

			if (Character.isDigit(name.charAt(i))) {

				// char ch = name.charAt(i);

				// String str = String.valueOf(ch);

				// int digit = Integer.parseInt(str);

				// sum = sum + digit;

				sum = sum + Integer.parseInt(String.valueOf(name.charAt(i)));
			}
		}

		System.out.println("sum: " + sum);

	}

}
