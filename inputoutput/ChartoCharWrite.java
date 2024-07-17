package com.inputoutput;

import java.io.FileWriter;

public class ChartoCharWrite {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter f = new FileWriter("D://file.txt");
		
		char[] c= {'a' ,'b','c'};
		
		f.write(c);
		f.write("   ");
		f.write("Ritesh");
	    f.close();
	    System.out.println("done");
	
	}

}