package com.string;

public class palindrome {

	public static void main(String[] args) {
		
		String s = " mem ";
		String rev = "";
		for(int i = s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		if(rev.matches(s)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}
}
