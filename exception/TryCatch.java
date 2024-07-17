package com.exception;

public class TryCatch {

	public static void main(String[] args) {
		try {
			String s = null;
			double a = Integer.parseInt(s);
		} catch (NumberFormatException e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
