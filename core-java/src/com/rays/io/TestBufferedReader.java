package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestBufferedReader {

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("C:\\Users\\Aman Singh Yashona\\Desktop\\io\\hello.txt");

		BufferedReader in = new BufferedReader(file);

		String line = in.readLine();

		while (line != null) {

			System.out.println(line);

			line = in.readLine();
		}

		in.close();
		file.close();
	}

}
