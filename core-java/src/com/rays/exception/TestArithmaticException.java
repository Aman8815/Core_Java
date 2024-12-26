package com.rays.exception;

public class TestArithmaticException {

	public static void main(String[] args) {

		try {
			
			System.out.println("before");

			int i = 10 / 0;

			System.out.println("division = " + i);
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("after");
	}
}
