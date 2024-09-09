package oops.singletonClass;

public class CalciMain {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Calci c1= Calci.getInstance();
		Calci c2= Calci.getInstance();
		Calci c3= Calci.getInstance();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println("Main Method Ended");
	}
}
