package com.basic;

public class bs {

	public static void main(String[] args) {
		int[] a = {1,5,6,9,7,55,2,4};
		int temp =0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length-i; j++) {
				if(a[j-1]>a[j]) {
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
				
			}
		}for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
