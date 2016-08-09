package com.zooassignment;

public class Snake extends Reptile {
	
	protected boolean eatsMice;

	public Snake(String breed, double weight, String color, int age, String type, boolean isColdBlooded) {
		super(breed, weight, color, age, type, isColdBlooded);
		// TODO Auto-generated constructor stub
	}

	public Snake(String breed, double weight, String color, int age, String type, boolean isColdBlooded,
			boolean eatsMice) {
		super(breed, weight, color, age, type, isColdBlooded);
		this.eatsMice = eatsMice;
	}

	public boolean isEatsMice() {
		return eatsMice;
	}

	public void setEatsMice(boolean eatsMice) {
		this.eatsMice = eatsMice;
	}
	

}
