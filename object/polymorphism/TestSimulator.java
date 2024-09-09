package oops.object.polymorphism;

public class TestSimulator {
		public static void main(String[] args) {
			System.out.println("Main Method Started");
			Cat c1= new Cat();
			Dog d1= new Dog();
			Snake s1= new Snake();
			AnimalSimulator as= new AnimalSimulator();
			as.makeNoise(c1);
			as.makeNoise(d1);
			as.makeNoise(s1);
			System.out.println("Main Method Ended");
		}
}
