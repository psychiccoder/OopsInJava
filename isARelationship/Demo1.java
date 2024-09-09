package oops.isARelationship;

public class Demo1 {
		int x=100;
		void test() {
			System.out.println("Test funct() running");
		}
}

// Demo2  is a type of Demo1
class Demo2 extends Demo1{
	int y=200;
	void disp() {
		System.out.println("Disp funct() running");
	}
}
