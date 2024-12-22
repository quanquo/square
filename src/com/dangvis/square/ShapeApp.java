package com.dangvis.square;

public class ShapeApp {
	public static void main(String[] args) {
		Circle smallCircle = new Circle(0, 0, 4);
		Circle anotherSmallCircle = new Circle(0, 0, 4);
		Circle bigCircle = new Circle(0, 0, 12);
		
		Rectangle smallRect = new Rectangle(4, 4, 16, 12);
		
		smallCircle.draw();
		bigCircle.draw();
		
		System.out.println("Small: " + smallCircle.toString());
		System.out.println("Area of small: " + smallCircle.calculateArea());
		System.out.println("Another small: " + smallCircle.toString());
		System.out.println("small equals small? " + smallCircle.equals(anotherSmallCircle));
		System.out.println("small equals big? " + smallCircle.equals(bigCircle));
		
		System.out.println("");
		
		smallRect.draw();
		
		System.out.println("Area of rectangle: " + smallRect.calculateArea());
		System.out.println("Rectangle equals small circle? " + smallCircle.equals(smallRect));
	}
}
