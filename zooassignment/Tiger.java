package com.zooassignment;

public class Tiger extends Animal {
	
	protected boolean isClimb;

	public Tiger(String breed, double weight, String color, int age, String type) {
		super(breed, weight, color, age, type);
		
	}
	
	public Tiger(String breed, double weight, String color, int age,String type, boolean isClimb){
		super(breed, weight, color, age, type);
		this.isClimb=isClimb;
		
	}

	public boolean isClimb() {
		return isClimb;
	}

	public void setClimb(boolean isClimb) {
		this.isClimb = isClimb;
	}
	
	

}
