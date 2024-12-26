package com.rays.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateToString {

	public static void main(String[] args) {

		Date today = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		String strDate = sdf.format(today);

		System.out.println(strDate);

	}

}
