package oops.absractClass;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println(Demo1.x);
		Demo1.test();
		System.out.println("-----------");
		Demo2 d1= new Demo2();
		System.out.println(d1.y);
		d1.disp();
		System.out.println("Main Method Ended");
	}
}
