package oops.isARelationship.inheritance.constructorChaining;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println("Creating Sample3 Object");
		Sample3 s1= new Sample3();
		System.out.println("------------------------");
		System.out.println("Creating Sample2 Object");
		Sample2 s2= new Sample2();
		System.out.println("------------------------");
		System.out.println("Creating Sample1 Object");
		Sample1 s3= new Sample1();
		System.out.println("Main Method Ended");
	}
}
