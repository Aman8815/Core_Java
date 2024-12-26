package com.rays.exception;

public class TestStringIndexException {

	public static void main(String[] args) {

		try {

			String str = null;

			System.out.println(str.length());

			System.out.println(str.charAt(6));

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
