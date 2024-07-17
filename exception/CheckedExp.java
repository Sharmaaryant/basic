package com.exception;

public class CheckedExp {
	public static void main(String[] args) {
		dad();
	}
	public static void dad() {
		try {
			mom();
		}catch(CheckedBaaap e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void mom() throws CheckedBaaap{
		son();
	}
	
	public static void son() throws CheckedBaaap{
		CheckedBaaap b = new CheckedBaaap();
		throw b;
	}
}
