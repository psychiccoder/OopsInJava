package oops.interface1;

public interface Demo1 {
	void test();
	void disp();
}

 class Sample1 implements Demo1{
	public  void test() {
		System.out.println("Test()");
	}
	public void disp() {
		System.out.println("Disp()");
	}
}
