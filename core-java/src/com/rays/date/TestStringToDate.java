package com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestStringToDate {

	public static void main(String[] args) throws ParseException {

		String strDate = "25-11-2024";

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		Date today = sdf.parse(strDate);

		System.out.println(today);

	}

}
