package com.oop;

public class MethodOverloading {

	public int add() {
		System.out.println("j");
		return 1;
	}
	
	
	public void  add(String n) {
		System.out.println("n");
	}
	public void add(String b, String c) {
		System.out.println(b+c);
	}
	
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.add();
		m.add("b");
		m.add("c","s");
	}
}
