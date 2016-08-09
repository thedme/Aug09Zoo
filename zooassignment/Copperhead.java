package com.zooassignment;

public class Copperhead extends Snake {
	protected boolean isEatingMud;
	
	public Copperhead(String breed, double weight, String color, int age, String type, boolean isColdBlooded) {
		super(breed, weight, color, age, type, isColdBlooded);
		// TODO Auto-generated constructor stub
	}

	public Copperhead(String breed, double weight, String color, int age, String type, boolean isColdBlooded,
			boolean isEatingMud) {
		super(breed, weight, color, age, type, isColdBlooded);
		this.isEatingMud = isEatingMud;
	}

	public boolean isEatingMud() {
		return isEatingMud;
	}

	public void setEatingMud(boolean isEatingMud) {
		this.isEatingMud = isEatingMud;
	}

	

	
	
	
	
	
	
	}


