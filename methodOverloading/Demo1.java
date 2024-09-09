package oops.methodOverloading;

public class Demo1 {
		void test() {
			System.out.println("Test() ");
		}
}

class Demo2 extends Demo1{
	void test(int arg) {
		System.out.println("Test(int arg)");
	}
}