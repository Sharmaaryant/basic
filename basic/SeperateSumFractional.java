
package com.basic;

public class SeperateSumFractional {

	public static void main(String[] args) {
		
		
		  double [] a = {10.3,5.252,7.2,9.63};
		  for(int i =0; i<a.length; i++) {
		  String s =String.valueOf(a[i]); 
		  String [] arr =s.split("[.]");
		  
		  for (int j = 0; j < arr.length; j++) {
			
			  System.out.println((arr[j])); 
		}

		  }
		 
		/*
		 * double[] a = { 10.33, 16.7, 14.3, 12.4 };
		 * 
		 * int[] x; x = new int[a.length]; float[] f; f = new float[a.length]; for (int
		 * i = 0; i < a.length; i++) { x[i] = (int) a[i]; f[i] = (float) (a[i] - x[i]);
		 * 
		 * System.err.println(x[i]); System.out.println(f[i]); }
		 */
}
}

