package com.rays.string;

public class TestOccuranceCountFromArray {

	public static void main(String[] args) {

		String[] names = { "Aman", "Yashona" };

		int count = 0;

		for (char ch = 'a'; ch <= 'z'; ch++) {

			for (int i = 0; i < names.length; i++) {

				for (int j = 0; j < names[i].length(); j++) {

					String name = names[i].toLowerCase();

					if (name.charAt(j) == ch) {

						count++;

					}
				}
			}
			if (count > 0) {
				System.out.println(ch + " = " + count);
				count = 0;
			}
		}
	}
}
