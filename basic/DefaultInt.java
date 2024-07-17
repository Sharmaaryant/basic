package com.basic;

@FunctionalInterface
public interface DefaultInt {

	public void add();
	
	public default void defMeth() {
		System.out.println("Default");
	}
	
	public static void staMeth() {
		System.out.println("Static");
	}
}
