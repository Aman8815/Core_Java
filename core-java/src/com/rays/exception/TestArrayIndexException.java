package com.rays.exception;

public class TestArrayIndexException {

	public static void main(String[] args) {

		try {

			int[] arr = { 10, 20, 30 };
			System.out.println(arr[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}finally {
			System.out.println("finally");
		}
	}
}
