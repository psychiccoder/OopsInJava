package oops.methodOverriding;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Demo2 d1= new Demo2();
		d1.wish();
		Demo1 d2= new Demo2();
		d2.wish();
		System.out.println("Main Method Ended");
	}
}
