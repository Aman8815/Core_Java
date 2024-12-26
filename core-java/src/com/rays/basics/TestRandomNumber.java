package com.rays.basics;

public class TestRandomNumber {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			System.out.println((int) (Math.random() * 10000));

		}
	}
}
