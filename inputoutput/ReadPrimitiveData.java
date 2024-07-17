package com.inputoutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadPrimitiveData {

	public static void main(String[] args) throws IOException {
	
		DataInputStream d = new DataInputStream(new FileInputStream("D://binary.txt"));
		
		System.out.println(d.readInt());
		 System.out.println(d.readBoolean());
		 System.out.println(d.readChar());
	    System.out.println(d.readDouble());
	   
	    
		
		d.close();
		
	}
	
}
