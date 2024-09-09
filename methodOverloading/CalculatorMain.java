package oops.methodOverloading;

public class CalculatorMain {
		public static void main(String[] args) {
			System.out.println("Main Method Started");
			Calculator c1= new Calculator();
			System.out.println(c1.square(10));
			System.out.println(c1.square(10.1));
			System.out.println(c1.sum(10,20));
			System.out.println(c1.sum(10,20,30));
			System.out.println("Main Method Ended");
		}
}
