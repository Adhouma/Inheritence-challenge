package com.learnJava;

public class Ford extends Car {

	public Ford(String name, String color, int wheels, int doors, int speed) {
		super(name, color, wheels, doors, speed);
	}
	
	@Override
	public void move() {
		int newSpeed = this.getSpeed() + 50;
		System.out.println(this.getName() + " is moving, speed is: " + newSpeed + " Km/h");
	}

	@Override
	public void stop() {
		this.setSpeed(0);
		System.out.println(this.getName() + " is stopped now, speed is: " + this.getSpeed());
	}

	@Override
	public void changeGear(String color) {
		super.setColor(color);
		System.out.println(this.getName() + "'s new color is: " + super.getColor());
	}
}
