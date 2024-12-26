package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		
		String strDate = "01-01-2024";

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");


		Person p = new Person();

		p.setId(10);
		p.setFirstName("abc");
		p.setLastName("xyz");
		p.setLoginId("abc@gmail.com");
		p.setPassword("123");
		p.setDob(sdf.parse(strDate));
		p.setAddress("indore");

		System.out.println(p.getId());
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(p.getLoginId());
		System.out.println(p.getPassword());
		System.out.println(sdf.format(p.getDob()));
		System.out.println(p.getAddress());

	}

}
