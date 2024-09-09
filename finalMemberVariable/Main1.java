package oops.finalMemberVariable;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println(Demo1.x);
		Demo1 d1= new Demo1();
		System.out.println(d1.y);
		System.out.println("Main Method Ended");
	}
}
