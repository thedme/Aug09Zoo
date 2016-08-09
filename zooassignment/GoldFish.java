package com.zooassignment;

public class GoldFish extends Fish {
	protected boolean hasTwoSecondMemory;

	public GoldFish(String breed, double weight, String color, int age, String type, boolean isSwimming) {
		super(breed, weight, color, age, type, isSwimming);
		// TODO Auto-generated constructor stub
	}

	public GoldFish(String breed, double weight, String color, int age, String type, boolean isSwimming, boolean hasTwoSecondMemory) {
		super(breed, weight, color, age, type);
		this.hasTwoSecondMemory = hasTwoSecondMemory;
	}

	public boolean isHasTwoSecondMemory() {
		return hasTwoSecondMemory;
	}

	public void setHasTwoSecondMemory(boolean hasTwoSecondMemory) {
		this.hasTwoSecondMemory = hasTwoSecondMemory;
	}
	

}
