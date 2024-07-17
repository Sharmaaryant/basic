package com.basic;

import java.util.Scanner;

public class ScannerNoteCount {

	public static void main(String[] args) {
		int amount;
		int count =0;
		int[] note = {2000,1000,500,200,100,50,20,10,5,2,1};
		System.out.println("Enter Amount =");
		Scanner sc = new Scanner(System.in);
		amount = sc.nextInt();
		
		for(int i=0;i<note.length;i++) {
			count = amount/note[i];
			amount -= count*note[i];
			System.out.println(note[i] +" = " + count);
		}
	}
}
