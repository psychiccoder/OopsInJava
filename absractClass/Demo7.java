package oops.absractClass;

abstract public class Demo7 {
	void test() {
		System.out.println("Test()");
	}
	abstract void disp() ;
	abstract void show();
}

abstract class Demo8 extends Demo7{
	void disp() {
		System.out.println("Disp()");
	}
}

class Demo9 extends Demo8{
	void show() {
		System.out.println("Show()");
	}
}