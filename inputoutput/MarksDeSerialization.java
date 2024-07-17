package com.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MarksDeSerialization {

	public static void main(String[] args) throws  IOException, ClassNotFoundException {
		
		ObjectInputStream o = new ObjectInputStream(new FileInputStream("D://Ser.txt"));
		
		 Marksheet m= (Marksheet) o.readObject();
		 
		 System.out.println(m.getName());
		 System.out.println(m.getChemistry());
		 System.out.println(m.getMaths());
		 System.out.println(m.getPhysics());
		 System.out.println(m.getPercentage());
		 System.out.println("temp " + m.getTemp());
		 
		 o.close();
	}
}
