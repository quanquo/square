package com.dangvis.square;

public class Rectangle extends Shape {
	private int width;
	private int height;

	// constructor
	public Rectangle(int newX, int newY, int newWidth, int newHeight) {
		super(newX, newY);
		setWidth(newWidth);
		setHeight(newHeight);
	}

	@Override
	public double calculateArea() {
		return width * height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle at:(" + getX() + ", " + getY() + "), width " + getWidth() + ", height "
				+ getHeight());
	}
	
	@Override
	public String toString() {
		return "Rectangle with: " + getWidth() + "and height: " + getHeight();
	}
	
	@Override
	public boolean equals(Object compareObj) {
		Rectangle compareRectangle;
		
		if (compareObj instanceof Rectangle)
			compareRectangle = (Rectangle) compareObj;
		else
			return false;
					
		return this.width == compareRectangle.width && this.height == compareRectangle.height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}