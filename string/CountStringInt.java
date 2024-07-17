package com.string;

public class CountStringInt {

	public static void main(String[] args) {
		
		String[] s = {" rit4ehs","fd5ko" };
		int count= 0;
		
		for(String b:s) {
			char[] c =b.toCharArray();
			for(int j=0; j<c.length; j++) {
				if(Character.isDigit(c[j])) {
					count += Integer.parseInt(String.valueOf(c[j]));
				}
			}
		}
		
		System.out.println(count);
		
		
	}
}
