package com.string;

public class OwnPlaceReplace {
public static void main(String[] args) {
	
	
			String s ="Ritesh Patidar ";
			String rev = "";
			String[] a = s.split("  ");
			
			for(String b:a) {
				char[] c = b.toCharArray();
				
				for(int i=c.length-1; i>=0; i--) {
					
					rev = rev + c[i];
				}
			}
			System.out.println(rev);
		}

	}



