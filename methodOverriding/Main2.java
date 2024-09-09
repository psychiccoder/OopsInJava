package oops.methodOverriding;

public class Main2 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Demo7 d1= new Demo7();
		Demo7.wish();
		d1.disp();
		System.out.println("------------");
		Demo8 d2 = new Demo8();
		Demo8.wish();
//		Demo8.disp();
//		d2.disp();
		System.out.println("Main Method Ended");
	}
}
