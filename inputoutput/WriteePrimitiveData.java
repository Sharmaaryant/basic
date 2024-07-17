package com.inputoutput;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteePrimitiveData {

	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("D://binary.txt");
		DataOutputStream dout = new DataOutputStream(out);
		dout.writeInt(2);
		dout.writeBoolean(false);
		dout.writeChar('a');
		dout.writeDouble(1.2);
		dout.close();
	}
}
