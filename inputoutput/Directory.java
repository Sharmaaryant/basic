package com.inputoutput;

import java.io.File;
import java.util.Dictionary;

public class Directory {

	public static void main(String[] args) {
		File dic =new File("D:\\my sql");
		
		//get the list of file and directorty
		
		String[] files = dic.list();
		
		for(String f : files) {
			System.out.println(f);
			
			//Create a subdirectory
			
			File subDir = new File(dic,"Nest");
			subDir.mkdir();
			
		}
	}
}
