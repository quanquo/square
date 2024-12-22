package com.dangvis.square;

public abstract class Shape {
	
	protected int x;
	protected int y;
	
	protected Shape(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public double calculateArea() {
        return 0;
    }
	
	public abstract void draw();

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
