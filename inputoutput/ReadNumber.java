package com.inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadNumber {

	public static void main(String[] args) throws IOException {
		
		PrintWriter p = new PrintWriter(new FileWriter("D://key.txt"));
		BufferedReader b = new BufferedReader(new FileReader("D://q.txt"));
		
		String line = b.readLine();
		
		while(line!=null) {
			if(line.length()==10) {
				p.write(line);
				System.out.println(line);
			}line = b.readLine();
		}p.close();
		b.close();
	}
}
