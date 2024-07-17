package com.exception;

public class UncheckedExp {
public static void main(String[] args) {
	dad();
}
	public static void dad() {
		mom();
	}
	public static void mom() {
		son();
	}
	public static void son() {
		RuntimeException r = new RuntimeException("helllo");
		throw r;
	}
}
