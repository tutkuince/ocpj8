package com.oracle.javacert.professional.chapter06._03assertions;

public class Rectangle {

	private int width, height;

	public Rectangle(int width, int height) {
//		if(width < 0 || height < 0)
//			throw new IllegalArgumentException();
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		assert isValid() : "Not a valid Rectangle";
		return width * height;
	}

	private boolean isValid() {
		return (width >= 0 && height >= 0);
	}

	public static void main(String[] args) {
		Rectangle one = new Rectangle(5, 12);
		Rectangle two = new Rectangle(-4, 10);
		
		System.out.println("Area one = " + one.getArea());
		System.out.println("Area two = " + two.getArea());	// AssertionError
		
		
	}
}
