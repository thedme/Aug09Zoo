package com.zooassignment;

public class Reptile extends Animal {
	
	protected boolean isColdBlooded = true;
	
	public Reptile(String breed, double weight, String color, int age, String type, boolean isColdBlooded) {
		super(breed, weight, color, age, type);
		this.isColdBlooded = isColdBlooded;
	}

	public boolean isColdBlooded() {
		return isColdBlooded;
	}

	public void setColdBlooded(boolean isColdBlooded) {
		this.isColdBlooded = isColdBlooded;
	}

	
	
	

}
