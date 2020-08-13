package com.learnJava;

public class Vehicle {
	// Fields
	private String name;
	private String color;
	private int wheels;
	private int doors;
	private int speed;
	
	// Constructors
	public Vehicle() {
		this("Vehicule", "White", 4, 4, 0);
	}
	public Vehicle(String name, String color, int wheels, int doors, int speed) {
		this.name = name;
		this.color = color;
		this.wheels = wheels;
		this.doors = doors;
		this.speed = speed;
	}
	
	// Methods
	public void move() {}
	public void stop() {}
	public void changeGear(String color) {}
	
	// Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
