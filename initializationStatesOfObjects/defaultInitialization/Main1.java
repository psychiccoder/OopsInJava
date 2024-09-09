package oops.initializationStatesOfObjects.defaultInitialization;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Demo1 d1= new Demo1();
		System.out.println(d1.x+"\n"+d1.y+"\n"+d1.z+"\n"+d1.s);
		System.out.println("--------------");
		System.out.println();
		System.out.println(d1.a+"\n"+d1.b+"\n"+d1.c+"\n"+d1.st);
		System.out.println("Main Method Ended");
	}
}
