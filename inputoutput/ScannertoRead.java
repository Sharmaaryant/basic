package com.inputoutput;

import java.io.FileReader;
import java.util.Scanner;

public class ScannertoRead {
	
	public static void main(String[] args) throws Exception {
		
		FileReader f = new FileReader("D:/abc.txt");
		Scanner s = new Scanner(f);
		
		while (s.hasNext()) {
			String line = s.nextLine();
			System.out.println(line);
			
		}
		
		f.close();
		s.close();
	}
}