package com.zooassignment;

public class Scorpion extends Reptile {
	
	protected boolean hasStinger;

	public Scorpion(String breed, double weight, String color, int age, String type, boolean isColdBlooded) {
		super(breed, weight, color, age, type, isColdBlooded);
		// TODO Auto-generated constructor stub
	}

	public Scorpion(String breed, double weight, String color, int age, String type, boolean isColdBlooded,
			boolean hasStinger) {
		super(breed, weight, color, age, type, isColdBlooded);
		this.hasStinger = hasStinger;
	}

	public boolean isHasStinger() {
		return hasStinger;
	}

	public void setHasStinger(boolean hasStinger) {
		this.hasStinger = hasStinger;
	}
	

}
