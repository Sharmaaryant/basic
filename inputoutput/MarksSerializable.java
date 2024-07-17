package com.inputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MarksSerializable {

	public static void main(String[] args) throws IOException {
		
		Marksheet m = new Marksheet() ;
		m.setName("Ritesh");
		m.setChemistry(55);
		m.setMaths(88);
		m.setPhysics(99);
		m.setTemp(88);
		
		FileOutputStream f = new FileOutputStream("D://Ser.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		
		System.out.println("total" +"  "+ m.getTotal());
		System.out.println("perscentage"+ "  " + m.getPercentage());
		o.writeObject(m);
		f.close();
		o.close();

		System.out.println("done");
		}
}
