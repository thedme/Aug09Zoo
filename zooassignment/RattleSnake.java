package com.zooassignment;

public class RattleSnake extends Snake {
	
	protected boolean hasRattle;

	public RattleSnake(String breed, double weight, String color, int age, String type, boolean isColdBlooded,
			boolean eatsMice) {
		super(breed, weight, color, age, type, isColdBlooded, eatsMice);
		// TODO Auto-generated constructor stub
	}

	public RattleSnake(String breed, double weight, String color, int age, String type, boolean isColdBlooded, boolean eatsMice,
			boolean hasRattle) {
		super(breed, weight, color, age, type, isColdBlooded);
		this.hasRattle = hasRattle;
	}

	public boolean isHasRattle() {
		return hasRattle;
	}

	public void setHasRattle(boolean hasRattle) {
		this.hasRattle = hasRattle;
	}

}
