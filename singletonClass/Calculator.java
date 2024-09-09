package oops.singletonClass;

public class Calculator {

	private Calculator() {
		System.out.println("creating instances of calculator");
	}
	public void divide(int n,int m) {
		System.out.println("Dividing "+n+" by "+m);
		int res= n/m;
		System.out.println("result is "+res);
	}
	public static Calculator getInstance() {
		Calculator c1= new Calculator();
		return c1;
	}
	
}


