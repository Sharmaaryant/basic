package com.string;

public class ReverseAtPlace {

	public static void main(String[] args) {

		String s = "Ritesh Patidar";

		String[] str = s.split(" ");

		for (int i = 0; i <= str.length-1; i++) {
			for (int j = str[i].length() - 1; j >= 0; j--) {

				System.out.print(str[i].charAt(j));
			}
			
			System.out.print("  ");
		}

	}

}
