package com.rays.string;

public class TestSamePlaceReverse {

	public static void main(String[] args) {

		String name = "Aman Yashona";

		String[] names = name.split(" ");

		for (int i = 0; i < names.length; i++) {

			for (int j = names[i].length() - 1; j >= 0; j--) {

				System.out.print(names[i].charAt(j));

			}
			System.out.print(" ");
		}
	}
}
