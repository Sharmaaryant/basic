package com.inputoutput;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class LinebyLineWrite {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter f = new FileWriter("D:/user.txt");
		
		BufferedWriter bw = new BufferedWriter(f);
		
         char []ch = {'A' , 'B' ,'C' , 'D'};
		
		f.write(ch);
		f.write("Ritesh Patidarrrrrrrr");
		f.write("abc@gmail.com");
		f.close();
		System.out.println("done");
		
	}

}