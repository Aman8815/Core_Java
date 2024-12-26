package com.rays.exception;

public class TestLogin {

	public static void main(String[] args) {

		String login = "abc";
		String password = "xyz";

		if (login.equals("admin") && password.equals("admin")) {
			System.out.println("valid user");
		} else {
			try {
				throw new LoginException("invalid user");
			} catch (LoginException e) {
				System.out.println(e);
			}
		}

	}

}
