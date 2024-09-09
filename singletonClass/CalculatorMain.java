package oops.singletonClass;

public class CalculatorMain {
		public static void main(String[] args) {
			System.out.println("Main Method Started");
			Calculator c1= Calculator.getInstance();
			Calculator c2= Calculator.getInstance();
			Calculator c3= Calculator.getInstance();
			c1.divide(10, 2);
			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
			System.out.println("Main Method Ended");
		}
}
