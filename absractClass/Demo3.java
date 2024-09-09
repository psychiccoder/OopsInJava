package oops.absractClass;

abstract public class Demo3 {
	int x=100;
	void disp() {
		System.out.println("Disp()");
	}
	abstract void test();
}

class Demo4 extends Demo3{
	void test() {
		System.out.println("Test()");
	}
}
