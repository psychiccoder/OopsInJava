package oops.isARelationship.inheritance;

public class AnimalMain {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Dog d1 = new Dog();
		d1.bark();
		d1.eat();
		Mammal m1 = new Mammal ();
		m1.eat();
		System.out.println("Main Method Ended");
	}
}
