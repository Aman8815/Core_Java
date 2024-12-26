package com.rays.oop.inheritance;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();
		s.setColor("green");
		s.setBorderWidth(50);

		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());

		Rectangle r = new Rectangle();
		r.setLength(10);
		r.setWidth(20);
		r.setColor("red");
		r.setBorderWidth(500);

		System.out.println("length: " + r.getLength());
		System.out.println("width: " + r.getWidth());
		System.out.println("color: " + r.getColor());
		System.out.println("borderWidth: " + r.getBorderWidth());
		r.area();

		Circle c = new Circle();
		c.setRadius(10);

		System.out.println("radius: " + c.getRadius());
		System.out.println(Circle.PI);
		c.area();

		Triangle t = new Triangle();
		t.setBase(10);
		t.setHeight(20);
		t.setColor("red");
		t.setBorderWidth(500);

		System.out.println("base: " + t.getBase());
		System.out.println("height: " + t.getHeight());
		t.area();
	}
}
