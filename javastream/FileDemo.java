package com.javastream;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Stream<String>st=Files.lines(Paths.get("C:\\test\\marksheet.txt"));
			st.map(e -> e.split(",")).filter(e -> e.length == 4).map(
					x -> new Marksheet(x[0], Integer.parseInt(x[1]), Integer.parseInt(x[2]), Integer.parseInt(x[3])))
					.forEach(e -> {
						System.out.print("Name: " + e.name);
						System.out.print(" Physics: " + e.physics);
						System.out.print(" Chemistry: " + e.chemistry);
						System.out.println(" Maths: " + e.maths);
					});
		
		}
		catch(IOException e){
			e.printStackTrace();
			
		}

	}

}
