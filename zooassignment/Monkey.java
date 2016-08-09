package com.zooassignment;

public class Monkey extends Animal {
	
	protected boolean isClimb;
	protected boolean isPlayTrick;

	public Monkey(String breed, double weight, String color, int age, String type) {
		super(breed, weight, color, age, type);
	}
	
	public Monkey(String breed, double weight, String color, int age,String type, boolean isClimb, boolean isPlayTrick) {
		super(breed, weight, color, age, type);
		this.isClimb =isClimb;
		this.isPlayTrick=isPlayTrick;
	}

	public boolean isClimb() {
		return isClimb;
	}

	public void setClimb(boolean isClimb) {
		this.isClimb = isClimb;
	}

	public boolean isPlayTrick() {
		return isPlayTrick;
	}

	public void setPlayTrick(boolean isPlayTrick) {
		this.isPlayTrick = isPlayTrick;
	}
	

	
}
