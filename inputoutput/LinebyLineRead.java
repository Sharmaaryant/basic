package com.inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;

public class LinebyLineRead {
	
	public static void main(String[] args) throws Exception {
		 
		FileReader  r = new FileReader("D:\\my sql\\note.txt");
		BufferedReader br = new BufferedReader(r);
		
		 String line =  br.readLine();
		 
		// String reg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		 while(line!=null) {
			// if(line.matches(reg)){
			 System.out.println(line);
		// }
			 line = br.readLine();
		 }
		
		 br.close();
		 r.close();
	}
}