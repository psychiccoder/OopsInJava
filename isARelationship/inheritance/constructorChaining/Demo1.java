package oops.isARelationship.inheritance.constructorChaining;
// Explicit Constructor Chaining
public class Demo1 {
		Demo1(double arg){
			System.out.println("Running Demo1 Constrcutor");
			System.out.println("Arg value is "+arg);
		}
}

class Demo2 extends Demo1{
	Demo2(int arg){
		super(1.5);
		System.out.println("Running Demo2 Constrcutor");
		System.out.println("Arg value is "+arg);
	}
}

class Demo3 extends Demo2{
	Demo3(){
		super(10);
		System.out.println("Running Demo3 Constrcutor");
	}
}
