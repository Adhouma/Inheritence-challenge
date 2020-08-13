package com.learnJava;

public class Car extends Vehicle {

	public Car(String name, String color, int wheels, int doors, int speed) {
		super(name, color, wheels, doors, speed);
	}
	
	@Override
	public void move() {
		int newSpeed = this.getSpeed() + 50;
		System.out.println("Car is moving, speed is: " + newSpeed + " Km/h");
	}

	@Override
	public void stop() {
		this.setSpeed(0);
		System.out.println("Car is stopped now, speed is: " + this.getSpeed());
	}

	@Override
	public void changeGear(String color) {
		super.setColor(color);
		System.out.println("Car's new color is: " + super.getColor());
	}
}
