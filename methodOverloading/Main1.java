package oops.methodOverloading;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Demo2 d1= new Demo2();
		d1.test();
		d1.test(10);
		System.out.println("Main Method Ended");
	}
}
