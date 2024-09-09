package oops.object.polymorphism;

public class Animal {
		void noise() {
			System.out.println("All Animal make noise");
		}
}

class Cat extends Animal{
	void noise() {
		System.out.println("Meow..........Meow");
	}
}

class Dog extends Animal{
	void noise() {
		System.out.println("Bhau...........Bhau");
	}
}
class Snake extends Animal{
	void noise() {
		System.out.println("Hiss...........Hiss");
	}
}

