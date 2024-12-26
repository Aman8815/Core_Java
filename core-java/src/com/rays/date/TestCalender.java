package com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalender {

	public static void main(String[] args) throws ParseException {

		String strDate = "01-01-2024";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Date today = sdf.parse(strDate);

		Calendar cal = Calendar.getInstance();
		
		cal.setTime(today);

		System.out.println(sdf.format(cal.getTime()));

		cal.add(Calendar.DATE, 4);

		System.out.println(sdf.format(cal.getTime()));

	}
}
