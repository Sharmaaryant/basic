package com.inputoutput;

import java.io.FileOutputStream;
import java.io.FileReader;

public class ChartoCharRead {
	public static void main(String[] args) throws Exception {
		
		FileReader r = new FileReader("D:\\my sql\\note.txt");
		
		 int ch = r.read();
		 char chr;
		 
		 while(ch!=-1) {
			 chr = (char)ch;
			 System.out.print(chr);
			 ch = r.read();
			 
		 }
		 
		 r.close();
		
	}

}

