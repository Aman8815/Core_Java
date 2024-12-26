package com.rays.oop.abs;

public class TestShape {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		r.sum();

		Shape.sum();

		Shape s = new Rectangle();
		
		s.sum();
	}
}
