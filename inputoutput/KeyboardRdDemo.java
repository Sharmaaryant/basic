package com.inputoutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KeyboardRdDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
	FileWriter f =new FileWriter("D://Z.txt");
	PrintWriter p = new PrintWriter(f);
	 InputStreamReader s = new InputStreamReader(System.in);
	 
	 BufferedReader b = new BufferedReader(s);
	 
	 String line = b.readLine();
	 while(!line.equals("stop")){
		 
		 p.write(line);
		 System.out.println(line);
		 
		 line = b.readLine();
		 
		
		 
	 } f.close(); 
	 s.close();
	 p.close();
	
	
	
	
	}
}