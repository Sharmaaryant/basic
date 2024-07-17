package com.exception;

public class ProgrammaticException {

	static boolean isValidUser() {
		return false;
		
	}
	
	public static void main(String[] args) {
		boolean userFound = isValidUser();
		
		if(userFound) {
			System.out.println("Valid User");
		}else {
			RuntimeException r = new RuntimeException("Invalid User");
			throw r;
		}
	}
}
