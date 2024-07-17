package com.basic;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] n = { 999, 5, 10, 55, 74, 12, 4, 13, 14, 60 };
		int a = 0;
		int b = 0;
		for (int i = 0; i < n.length; i++) {
			if (a < n[i]) {
				b = a;
				a = n[i];
			}
			if (b < n[i] && n[i] < a) {
				b = n[i];
			}
		} // System.out.println( "Maximum	no :"+a);
		System.out.println("SecondLargest No : " + b);

	}
}
