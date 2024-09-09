package oops.casting;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Demo1 d1= new Demo2(); // upcasting
		
//		d1.test();
		Demo2 d2= (Demo2) new Demo1();
		d1.test();
		d2.test();
		d2.disp();
		System.out.println("Main Method Ended");
	}
}
