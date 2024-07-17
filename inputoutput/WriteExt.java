package com.inputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteExt {

	public static void main(String[] args) throws  IOException {
		
		MarksheetExt m = new MarksheetExt();
		m.setName("Ritesh");
		m.setMaths(99);
		m.setPhysics(97);
		m.setTemp(77);
		
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("D://Exten.txt"));
		o.writeObject(m);
		
		o.close();
	}
}
