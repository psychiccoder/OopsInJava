package oops.isARelationship.inheritance;

public class Demo3 {
	int x=100;
	void test() {
		System.out.println("Test () running");
	}
}

class Demo4 extends Demo3{
	int x=200;
	void disp() {
		int x=300;
		System.out.println("Local Variable X is "+x);
		System.out.println("Member Variable X is "+this.x);
		System.out.println("SuperClass  Variable X is "+super.x);
	}
}
