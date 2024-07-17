package com.basic;

public class Swapping {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int t;

		b=b-a;
		a=a+b;
		/*
		 * a = a + b; b = a - b; a = a - b;
		 * 
		 * System.out.println(a + " " + b);
		 */

		/*
		 * t = a; a = b; b = t;
		 */
		System.out.println(a + " " + b);
	}
}
