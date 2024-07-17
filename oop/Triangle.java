package com.oop;

public class Triangle extends Shape {

	private int base;
	private int height;
	
	/*
	 * public Triangle(int h, int b) { this.height=h; this.base=b; }
	 */
	public void setBase(int b) {
		this.base =b;
	}
	public int getBase() {
		return base;
	}
	
	public void setHeight( int h) {
		this.height =h;
	}
	
	public int getHeight() {
		return height;
	}
	
	public double area() {
		double area =base*height/2;
		System.out.println("area of triangle" + "= " +area);
		return area;
	}
}
