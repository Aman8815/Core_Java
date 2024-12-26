package com.rays.basics;

public class TestNoteCount {

	public static void main(String[] args) {

		int[] notes = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

		int amount = 101011;

		int count = 0;

		for (int i = 0; i < notes.length; i++) {

			count = amount / notes[i];

			if (count > 0) {

				System.out.println(notes[i] + " = " + count);

				count = 0;

			}

			amount = amount % notes[i];
		}
	}
}
