package com.oop;

public class HDFCBank extends Bank{

	@Override
	public String getName() {
		return "HDFC Bank";
	}
	
	public double interestRate() {
		return 15;
	}
}
