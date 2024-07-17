package com.basic;

public class SeperateandSumFractional {
	public static void main(String[] args) {

		double[] a = { 12.3, 32.45, 56.78, 8.78 };

	int [] b = new int[a.length];
	int [] c = new int[a.length];
	
	int d=0;
	int e=0;
	
	for(int i=0; i<a.length; i++) {
		
		String[] arr = String.valueOf(a[i]).split("[.]");
		
		b[i] = Integer.parseInt(arr[0]);
		c[i] = Integer.parseInt(arr[1]);
		
		System.out.println("integer value =" + b[i]);
		System.out.println("decimal value = " + c[i]);
		
		d= d+ b[i];
		e = e+ c[i];
	}
	System.out.println( "integer sum ="  +d);
	System.out.println("decimal sum =" +e);
		
		
	}

	}



