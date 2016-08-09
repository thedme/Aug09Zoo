package com.zooassignment;

public class Animal  {

	protected String breed;
	protected boolean eats;
	protected boolean sleep;
	protected double weight;
	protected String color;
	protected int age;
	protected String type;
	
	public Animal(String breed, double weight, String color, int age, String type)
	{
		this.breed = breed;
		this.weight = weight;
		this.color = color;
		this.age = age;
		this.type = type;
	}
	
	

	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public boolean isEats() {
		return eats;
	}

	public void setEats(boolean eats) {
		this.eats = eats;
	}

	public boolean isSleep() {
		return sleep;
	}

	public void setSleep(boolean sleep) {
		this.sleep = sleep;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public String getBreed() {
		return breed;
	}

	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	public boolean isEating()
	{
		return eats;
	}



	@Override
	public String toString() {
		return " a(n) " + type + " of color " + color + " of  the age " + age + "." ;
	}
	
	
	
}
