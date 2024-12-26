package com.rays.io;

import java.io.FileWriter;

public class TestFileWriter {

	public static void main(String[] args) throws Exception {

		FileWriter file = new FileWriter("C:\\Users\\Aman Singh Yashona\\Desktop\\io\\Write.txt", true);

		file.write("how are");

		file.close();
	}
}
