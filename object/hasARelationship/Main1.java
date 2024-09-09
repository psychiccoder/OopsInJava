package oops.object.hasARelationship;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Demo1 d1= new Demo1();
		System.out.println(d1.s1);
		System.out.println(d1.s1.x);
		d1.s1.disp();
		System.out.println("Main Method Ended");
	}
}
