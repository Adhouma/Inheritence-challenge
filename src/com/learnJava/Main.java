package com.learnJava;

public class Main {
	/**
	 * Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
	 * Finally, create another class, a specific type of Car that inherits from the Car class.
	 * You should be able to hand steering, changing gears, and moving (speed in other words).
	 * You will want to decide where to put the appropriate state and behaviours (fields and methods).
	 * As mentioned above, changing gears, increasing/decreasing speed should be included.
	 * For you specific type of vehicle you will want to add something specific for that type of car.
	 */
	public static void main(String[] args) {
		System.out.println("/*--- Vehicule ---*/");
		Vehicle vehicle = new Vehicle();
		System.out.println("Name: " + vehicle.getName());
		System.out.println("Color: " + vehicle.getColor());
		System.out.println("Wheels: " + vehicle.getWheels());
		System.out.println("Doors: " + vehicle.getDoors());
		System.out.println("Speed: " + vehicle.getSpeed());
		
		System.out.println("/*--- Simple Car ---*/");
		Car car = new Car("Fiat", "Red", 4, 4, 220);
		System.out.println("Name: " + car.getName());
		System.out.println("Color: " + car.getColor());
		System.out.println("Wheels: " + car.getWheels());
		System.out.println("Doors: " + car.getDoors());
		System.out.println("Speed: " + car.getSpeed());
		car.move();
		car.stop();
		car.changeGear("Yellow");
		
		System.out.println("/*--- Ford Raptor ---*/");
		Ford raptor = new Ford("Ford Raptor", "Black", 6, 4, 320);
		System.out.println("Name: " + raptor.getName());
		System.out.println("Color: " + raptor.getColor());
		System.out.println("Wheels: " + raptor.getWheels());
		System.out.println("Doors: " + raptor.getDoors());
		System.out.println("Speed: " + raptor.getSpeed());
		raptor.move();
		raptor.stop();
		raptor.changeGear("White");
	}
}
