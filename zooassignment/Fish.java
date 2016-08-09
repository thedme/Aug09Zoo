package com.zooassignment;

public class Fish extends Animal {
	
	protected boolean isSwimming;

	public Fish(String breed, double weight, String color, int age, String type) {
		super(breed, weight, color, age, type);
		
	}
	
	

	public Fish(String breed, double weight, String color, int age, String type, boolean isSwimming) {
		super(breed, weight, color, age, type);
		this.isSwimming = isSwimming;
	}



	public boolean isSwimming() {
		return isSwimming;
	}

	public void setSwimming(boolean isSwimming) {
		this.isSwimming = isSwimming;
	}
	

}
