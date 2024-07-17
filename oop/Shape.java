package com.oop;

public class Shape {

	private String color;
	private int borderWidth;
	
	//public Shape() {}
	//public Shape(int i) {}
	public void setColor(String color) {
		this.color =color;
	}
	public String getColor() {
		return color;
	}
	
	public void setBorderWidth(int borderWidth) {
		this.borderWidth =borderWidth;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public Shape getShape(int i) {
		if(i==1) {
			return new Rectangle();
		}
		if(i==2) {
			return new Circle();
		}
		if(i==3) {
			return new Triangle();
		}
		return null;
	}
	
	public double area() {
		System.out.println("parent");
		return 0;
	}
}
