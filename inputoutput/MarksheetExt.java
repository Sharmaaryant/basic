package com.inputoutput;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class MarksheetExt implements Externalizable{

	String name=null;
	int physics=0;
	int maths =0;
	
	transient int total =0;
	transient int temp =0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeObject(name);
		out.writeInt(physics);
		out.writeInt(maths);
        out.writeInt(temp);
       
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		
		name = (String) in.readObject();
		physics= in.readInt();
		maths= in.readInt();
		temp = in.readInt();
		
		
	}

	
}
