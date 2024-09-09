package oops.initializationStatesOfObjects.constructors;

public class EmplyeeMain {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Employee e1= new Employee(101,"Smith",12450.90);
		e1.details();
		
		System.out.println("Main Method Ended");
	}
}
