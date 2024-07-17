package com.oop;

public class TestShape {

	public static void main(String[] args) {
		
		Shape[] s = new Shape[3] ;
		
		s[0] = new Circle();
		s[1] = new Triangle();
		s[2] = new Rectangle();
		
		Circle c = (Circle) s[0];
		c.setBorderWidth(5);
		c.setColor("lal");
		c.setRadius(5);
		System.out.println(c.getBorderWidth());
		System.out.println(c.getColor());
		System.out.println("area of Circle"+c.area());
		
		Rectangle r = (Rectangle) s[2];
		r.setLength(4);
		r.setBreadth(5);
		r.area();
		
		Triangle t = (Triangle)s[1];
		t.setBase(8);
		t.setHeight(5);
		 s[1].area();
		
		
		
		/*
		 * s.setColor("red"); s.setBorderWidth(1); s.area();
		 * System.out.println(s.getBorderWidth()); System.out.println(s.getColor());
		 * 
		 * 
		 * Circle c = new Circle(); c.setRadius(5); c.setColor("blue");
		 * c.setBorderWidth(4); c.area(); System.out.println(c.getBorderWidth());
		 * System.out.println(c.getColor());
		 * 
		 * 
		 * s = new Triangle(20,5) ; s.area();
		 */
		
	}
}
