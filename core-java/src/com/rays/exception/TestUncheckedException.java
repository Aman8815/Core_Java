package com.rays.exception;

public class TestUncheckedException {

	public static void main(String[] args) {
		System.out.println("before");
		try {
			dad();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("after");
	}

	public static void dad() {
		mom();
	}

	public static void mom() {
		son();
	}

	public static void son() {
		throw new RuntimeException("sorry");
	}
}
