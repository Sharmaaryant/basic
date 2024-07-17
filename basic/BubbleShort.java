
package com.basic;

public class BubbleShort {

	public static void main(String[] args) {
		int[] a = { 1, 34,21, 54, 32, 21, 45, 65, 79,2 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length -i; j++) {
				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
}
}