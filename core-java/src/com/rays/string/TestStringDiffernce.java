package com.rays.string;

public class TestStringDiffernce {

	public static void main(String[] args) {

		String str = "abc";

		str = "xyz";

		System.out.println(str);

		StringBuffer sb = new StringBuffer("abc");

		sb.append("def");

		System.out.println(sb);

	}
}
