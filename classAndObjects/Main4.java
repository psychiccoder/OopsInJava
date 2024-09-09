package oops.classAndObjects;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method Started");
		Demo4 d1= new Demo4();
		System.out.println("The Value of x is "+d1.x+"\nThe Value Of Y is "+d1.y);
		d1.x=10;
		d1.y=20;
		System.out.println("The Value of x is "+d1.x+"\nThe Value Of Y is "+d1.y);
		d1= new Demo4();  // re-initialization
		System.out.println("The Value of x is "+d1.x+"\nThe Value Of Y is "+d1.y);
		
		System.out.println("Main Method Ended");
	}

}
