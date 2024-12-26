package com.rays.exception;

public class TestMultiCatch {

	public static void main(String[] args) {

		try {

			int division = 10 / 0;

			System.out.println("Division: " + division);

		} catch (ArithmeticException e) {
			// System.exit(0);
			System.out.println(e);
		} catch (RuntimeException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally");
		}
		System.out.println("after");
	}
}
