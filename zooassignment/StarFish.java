package com.zooassignment;

public class StarFish extends Fish{
	protected boolean isOnSand;

	public StarFish(String breed, double weight, String color, int age, String type) {
		super(breed, weight, color, age, type);
		
	}

	public StarFish(String breed, double weight, String color, int age, String type, boolean isOnSand) {
		super(breed, weight, color, age, type);
		this.isOnSand = isOnSand;
	}

	public boolean isOnSand() {
		return isOnSand;
	}

	public void setOnSand(boolean isOnSand) {
		this.isOnSand = isOnSand;
	}
	
	

}
