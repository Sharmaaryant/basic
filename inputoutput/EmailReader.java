package com.inputoutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmailReader {

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("D://q.txt");
		BufferedReader r = new BufferedReader(f);
		
		String line = r.readLine();
		 String reg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		while(line!=null) {
			if(line.matches(reg)) {
				System.out.println(line);
			}  line = r.readLine();
		}f.close();
		r.close();
	}
}
