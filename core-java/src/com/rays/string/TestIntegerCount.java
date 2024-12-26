package com.rays.string;

public class TestIntegerCount {

	public static void main(String[] args) {

		String name = "Am1an2Yas3hona4";

		for (int i = 0; i < name.length(); i++) {

			if (Character.isDigit(name.charAt(i))) {

				System.out.println(name.charAt(i));
			}
		}
	}

}
