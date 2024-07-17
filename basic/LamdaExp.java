package com.basic;

public class LamdaExp {

	public static void main(String[] args) {
		
		Adding a1=(a,b)->{
			return(a+b);
		};
		int c =a1.add(7, 1);
		System.out.println(c);
	}
}
