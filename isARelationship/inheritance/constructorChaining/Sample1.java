package oops.isARelationship.inheritance.constructorChaining;

//Implicit Constrcutor Chaining

public class Sample1 {
	Sample1(){
		System.out.println("Running Sample1 class Constructor");
	}
}
class Sample2 extends Sample1{
	Sample2(){
		System.out.println("Running Sample2 class Constructor");
	}
}
class Sample3 extends Sample2{
	Sample3(){
		System.out.println("Running Sample3 class Constructor");
	}
}
