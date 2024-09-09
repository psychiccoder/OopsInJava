package oops.classAndObjects;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method Started");
		Demo5 d1= new Demo5();
		System.out.println("The Value of x is "+d1.x+"\nThe Value Of Y is "+d1.y);
		Demo5 d2= d1;  // copy d1 to d2
		d2.x=90;
		d2.y=80;
		System.out.println("The Value of x is "+d1.x+"\nThe Value Of Y is "+d1.y);
		System.out.println("Main Method Ended");
	}

}

// d1 and d2 are not object but the object name or referance to object
