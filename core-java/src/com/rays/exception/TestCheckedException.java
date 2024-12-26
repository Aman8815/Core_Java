package com.rays.exception;

public class TestCheckedException {

	public static void main(String[] args) throws Exception {

		System.out.println("before");
		try {
			dad();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("after");
	}

	public static void dad() throws Exception {
		mom();
	}

	public static void mom() throws Exception {
		son();
	}

	public static void son() throws Exception {
		throw new Exception("sorry");
	}
}
