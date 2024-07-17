package com.exception;

public class TestCustomUnchecked {

	public static void main(String[] args) {
		int i =9;
		
		if(i!=9) {
			System.out.println("9 hai");
		}else {
			CustomUnchecked c = new CustomUnchecked();
			System.out.println("heeelloo");
			throw c;
		}
	}
}
