package oops.interface1;

public interface Demo3 {
		void test();
}
interface Test extends Demo3{
	void disp();
}
class Sample3 implements Test{
	public void disp() {
		System.out.println("disp()");
	}
	public void test() {
		System.out.println("Test()");
	}
	
}
