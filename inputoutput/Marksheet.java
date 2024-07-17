package com.inputoutput;

import java.io.Serializable;

public class Marksheet implements Serializable {

	String name =null;
	int physics =0;
	int chemistry =0;
	int maths =0;
	
	
	transient int total =0;
	
	transient double percentage =0;
	
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
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
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
	
	public int getTotal() {
		total =maths +physics +chemistry;
		return total;
		
	}
	
	public double getPercentage() {
		percentage = total/3;
		return percentage;
	}

}
