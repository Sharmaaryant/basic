package com.basic;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] a = {5,2,4,0,99,8,9,0,1,7};
		int[] b = {5,2,4,3,8,9,0,1,6};
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					break;
				}else {
					if(j==(b.length-1)) {
						System.out.println("missing no. is : "+ a[i] +b[j]);
					}
					
				}
			}
		}
	}
}
