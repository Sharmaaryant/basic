package com.exc;

public class Demo1 {

	public static void main(String[] args) {
		String str = "null";
		try {
			double i = Double.parseDouble(str);
			System.out.println(i);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("i am finally");
		}

	}

}
