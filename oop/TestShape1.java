package com.oop;

public class TestShape1 {

	public static void main(String[] args) {
		
		Shape s = new Shape();
		
		
		Rectangle r = (Rectangle) s.getShape(1);
		r.setLength(5);
		r.setBreadth(4);
		r.area();
		
		Circle c =(Circle) s.getShape(2);
		c.setRadius(5);
		c.area();
		
		Triangle t = (Triangle) s.getShape(3);
		t.setBase(5);
		t.setHeight(5);
		t.area();
		
	}
}
