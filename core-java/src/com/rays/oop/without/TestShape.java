package com.rays.oop.without;

public class TestShape {

	public static void main(String[] args) {

		Shape shape = new Rectangle();

		Rectangle r = (Rectangle) shape;

		r.setLength(10);
		r.setWidth(20);

		shape.area();
		r.area();

	}
}
