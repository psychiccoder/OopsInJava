package oops.absractClass;

abstract public class Demo5 {
	int x=100;
	abstract void test();
	abstract void disp();
}

class Demo6 extends Demo5{
	void test() {
		System.out.println("Test()");
	}
	void disp() {
		System.out.println("Disp()");
	}
}
