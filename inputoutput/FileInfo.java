package com.inputoutput;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {
		
		
		File f = new File("D:/rit.txt");
		if(f.exists()) {
			System.out.println("name" + " " +f.getName());
			System.out.println("path" + " " +f.getAbsolutePath());
			System.out.println("Writeable" + " " +f.canWrite());
			System.out.println("read" + " " +f.canRead());
			System.out.println("file" + " " +f.isFile());
			System.out.println("dir" + " " +f.isDirectory());
			
			
			Date d = new Date(f.lastModified());
			System.out.println("date" + " " +d);
			System.out.println("length" + " " +f.length());
		}
		
	}
}

