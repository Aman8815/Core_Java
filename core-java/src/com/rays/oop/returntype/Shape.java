package com.rays.oop.returntype;

public class Shape {

	public double area() {
		System.out.println("Shape Area Method");
		return 0;
	}

	public static Shape getShape(int i) {

		if (i == 1) {
			return new Rectangle();
		}
		if (i == 2) {
			return new Circle();
		}
		if (i == 3) {
			return new Triangle();
		}
		return new Shape();
	}
}
