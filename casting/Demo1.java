package oops.casting;

public class Demo1 {
	int x=10;
	void test() {
		System.out.println("test()in Demo1");
	}
}

class Demo2 extends Demo1{
	int y=20;
	void disp() {
		System.out.println("disp()");
	}
	void test() {
		System.out.println("test() in Demo2");
	}
}

