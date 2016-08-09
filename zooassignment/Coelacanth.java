package com.zooassignment;

public class Coelacanth extends Fish {
	
	protected boolean isAFossil;

	public Coelacanth(String breed, double weight, String color, int age, String type, boolean isSwimming) {
		super(breed, weight, color, age, type, isSwimming);
		// TODO Auto-generated constructor stub
	}

	public Coelacanth(String breed, double weight, String color, int age, String type, boolean isSwimming, boolean isAFossil) {
		super(breed, weight, color, age, type, isSwimming);
		this.isAFossil = isAFossil;
	}

	public boolean isAFossil() {
		return isAFossil;
	}

	public void setAFossil(boolean isAFossil) {
		this.isAFossil = isAFossil;
	}
	
	
	
	
}
