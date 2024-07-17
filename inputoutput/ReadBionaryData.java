package com.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadBionaryData {

	public static void main(String[] args) throws Exception {
	
		
		String source="D:\\a\\images (6).jpeg";
		String target="D:\\b\\download (2).jpeg";
		FileInputStream st=new FileInputStream(source);
		FileOutputStream fr=new FileOutputStream(target);
		int i=st.read();
		while(i!=-1)
		{
			fr.write(i);
			i=st.read();
		}
		st.close();
		fr.close();

	}
}