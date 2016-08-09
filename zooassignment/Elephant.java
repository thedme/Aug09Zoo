package com.zooassignment;

public class Elephant extends Animal {
	
	protected boolean hasTrunk;
	protected int tuskLength;
	
	public Elephant(String breed, double weight, String color, int age, String type) {
		super(breed, weight, color, age, type);
		
	}
	
	public Elephant(String breed, double weight, String color, int age, String type, boolean hasTrunk, int tuskLength)
	{
		super(breed, weight, color, age, type);
		this.hasTrunk = hasTrunk;
		this.tuskLength=tuskLength;
	}

	public boolean isHasTrunk() {
		return hasTrunk;
	}

	public void setHasTrunk(boolean hasTrunk) {
		this.hasTrunk = hasTrunk;
	}

	public int getTuskLength() {
		return tuskLength;
	}

	public void setTuskLength(int tuskLength) {
		this.tuskLength = tuskLength;
	}
	

	
	
}
