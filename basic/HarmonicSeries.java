package com.basic;

public class HarmonicSeries {
 
	public static void main(String[] args) {
		int n =2;
		double r= 0.0;
		
		for(int i =n; i>0; i--) {
			r =r+ (double)1/n;
			n--;
			System.out.println(r);
		}
	}
}
