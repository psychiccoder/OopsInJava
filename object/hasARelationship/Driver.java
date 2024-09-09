package oops.object.hasARelationship;

public class Driver {
	private Vehicle v1;
	void decideVehicle(Vehicle v1) {
		this.v1=v1;
	}
	void drive(Vehicle v1) {
		v1.start();
		v1.move();
		v1.stop();
	}
}

class Vehicle {
	void drive() {
		c1.start();
		c1.move();
		c1.stop();
	}
}
class Car1 extends Vehicle{
	void start() {
		System.out.println("start........");
	}
	void move() {
		System.out.println("moving........");
	}
	void stop() {
		System.out.println("stop........");
	}
}
class Bicycle extends Vehicle{
	void start() {
		System.out.println("start........");
	}
	void move() {
		System.out.println("moving........");
	}
	void stop() {
		System.out.println("stop........");
	}
}
class Bike extends Vehicle{
	void start() {
		System.out.println("start........");
	}
	void move() {
		System.out.println("moving........");
	}
	void stop() {
		System.out.println("stop........");
	}
}
