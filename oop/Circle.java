
package com.oop;

public class Circle extends Shape {
	
	private int radius;
	
	/*
	 * public Circle(int radius){ this.radius =radius;
	 * 
	 * }
	 */
	public void setRadius(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	
	public double area() {
		
	double area = 3.14*radius*radius;
	System.out.println("Circle " + area);
	return area;
	}
}
