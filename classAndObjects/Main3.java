package oops.classAndObjects;

public class Main3 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Demo3 d1= new Demo3();
		System.out.println("The Address Of Demo3 is "+ d1);
		System.out.println(d1.y);
		System.out.println(d1.x);
		d1.x=10;
		d1.y=20;
		System.out.println(d1.y);
		System.out.println(d1.x);
		System.out.println("Main Method Ended");
	}
}
