package com.dangvis.square;

public class Triangle extends Shape {

	// Declare private double variables base and height
	private double base;
	private double height;

	// Constructor for Triangle class that takes base and height as parameters
	public Triangle(int newX, int newY, double base, double height) {
		super(newX, newY);

		this.setBase(base);
		this.setHeight(height);
	}

	@Override
	public double calculateArea() {
		// Calculate and return the area of the triangle using the formula 0.5 * base *
		// height
		return 0.5 * base * height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a Triangle at:(" + getX() + ", " + getY() + "), base " + getBase() + ", height "
				+ getHeight());
	}
	
	@Override
	public String toString() {
		return "Triangle base: " + getBase() + "and height: " + getHeight();
	}
	
	@Override
	public boolean equals(Object compareObj) {
		Triangle compareTriangle;
		
		if (compareObj instanceof Triangle)
			compareTriangle = (Triangle) compareObj;
		else
			return false;
					
		return this.base == compareTriangle.base && this.height == compareTriangle.height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}