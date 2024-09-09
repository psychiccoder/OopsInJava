package oops.initializationStatesOfObjects.constructors;

//this keyword is use to refer current object member
public class Demo5 {
	int x=100;
	void display() {
		int x=200;
		System.out.println("The Value of Local Variable x is "+x);
		System.out.println("The Value of Member Variable x is "+this.x);
	}
}
