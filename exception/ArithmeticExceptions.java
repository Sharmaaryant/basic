package com.exception;

public class ArithmeticExceptions {

	public static void main(String[] args) {
		try{int i =0;
		int j =55;
		System.out.println("ex");
		double r =j/i;
		}catch(Exception e) {
			
		System.out.println(e.getMessage());
		
	}}
}
