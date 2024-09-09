package oops.object.hasARelationship;

public class Person {
		Car c1= new Car();
		void drive() {
			c1.start();
			c1.move();
			c1.stop();
		}
}

class Car{
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