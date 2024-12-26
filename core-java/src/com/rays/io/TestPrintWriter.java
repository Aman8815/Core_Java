package com.rays.io;

import java.io.FileWriter;
import java.io.PrintWriter;

public class TestPrintWriter {

	public static void main(String[] args) throws Exception {

		FileWriter file = new FileWriter("C:\\Users\\Aman Singh Yashona\\Desktop\\io\\hello.txt");

		PrintWriter out = new PrintWriter(file);

		out.println("how");
		out.println("are");
		out.println("you");

		out.close();
		file.close();
	}
}
