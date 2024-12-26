package com.rays.oop;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();
		s.setColor("green");
		s.setBorderWidth(50);
		
		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());
		
		Shape s1 = new Shape("red", 10);
		
		System.out.println(s1.getColor());
		
		s1.setColor("yellow");
		
		System.out.println(s1.getColor());
		System.out.println(s1.getBorderWidth());
		

	}
}
