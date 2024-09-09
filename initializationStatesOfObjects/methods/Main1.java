package oops.initializationStatesOfObjects.methods;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
			Demo1 d1= new Demo1();
			d1.setX(10);
			d1.setY("abc");
			d1.setZ(12.34);
			System.out.println("X: "+d1.getX()+"\nY: "+d1.getY()+"\nZ: "+d1.getZ());
		System.out.println("Main Method Ended");
	}
}
