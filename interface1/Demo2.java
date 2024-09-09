package oops.interface1;

public interface Demo2 {
		void test();
		void test(int arg);
}

class Sample2 implements Demo2{
	public void test() {
		System.out.println("Test()");
	}
	public void test(int arg) {
		System.out.println("Test(int arg)");
	}
}
