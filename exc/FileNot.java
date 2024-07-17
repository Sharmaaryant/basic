package com.exc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileNot {

	public static void main(String[] args) throws IOException {
		InputStream input = null;
		// TODO Auto-generated method stub
		try {
			input = new FileInputStream("file.txt");
			int data = input.read();
			while (data != -1) {
				System.out.println((char) data);
				data = input.read();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}

}
