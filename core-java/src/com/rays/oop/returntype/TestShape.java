package com.rays.oop.returntype;

public class TestShape {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = Shape.getShape(1);
		s[1] = Shape.getShape(2);
		s[2] = Shape.getShape(3);

		Rectangle r = (Rectangle) s[0];
		r.setLength(10);
		r.setWidth(20);

		Circle c = (Circle) s[1];
		c.setRadius(10);

		Triangle t = (Triangle) s[2];
		t.setBase(10);
		t.setHeight(20);

		double totalArea = 0;

		for (int i = 0; i < s.length; i++) {

			totalArea = totalArea + s[i].area();

		}

		System.out.println("Total Area = " + totalArea);
	}
}
