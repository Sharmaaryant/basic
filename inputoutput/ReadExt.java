package com.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadExt {

	public static void main(String[] args) throws  IOException, ClassNotFoundException {
		
		ObjectInputStream o = new ObjectInputStream(new FileInputStream("D://Exten.txt"));
   
		          MarksheetExt m = (MarksheetExt)  o.readObject();
		          
		          System.out.println("Name : " + m.getName());
		  		System.out.println("Physics : " + m.getPhysics());
		  		System.out.println("Maths :" + m.getMaths());
		  		System.out.println("Temp Value: " + m.getTemp());


		  		o.close();
		          
		          
		          
	}
}
