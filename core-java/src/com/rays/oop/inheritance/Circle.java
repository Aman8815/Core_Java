package com.rays.oop.inheritance;

public class Circle extends Shape {

	private int radius;

	public static final float PI = 3.14f;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void area() {
		float cArea = PI * radius * radius;
		System.out.println("Circle Area = " + cArea);
	}

}
