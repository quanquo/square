package com.dangvis.square;

public class Circle extends Shape {
	private double radius;
	
    public Circle(int newX, int newY, double radius) {
    	super(newX, newY);
        this.setRadius(radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

	@Override
	public void draw() {
		System.out.println("Drawing a Circle at:(" + getX() + ", " + getY() + "), radius " + getRadius());
	}

	@Override
	public String toString() {
		return "Circle radius: " + getRadius();
	}
	
	@Override
	public boolean equals(Object compareObj) {
		Circle compareCircle;
		
		if (compareObj instanceof Circle)
			compareCircle = (Circle) compareObj;
		else
			return false;
					
		return this.radius == compareCircle.radius;
	}	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
