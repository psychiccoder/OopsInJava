package oops.interface1;

public interface Demo4 {
	void test();
}
interface Demo5{
	void disp();
}
class Sample4 implements Demo4,Demo5{
	public void test() {
		System.out.println("test()");
	}
	public void disp() {
		System.out.println("disp()");
	}
}
