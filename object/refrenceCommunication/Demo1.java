package oops.object.refrenceCommunication;

public class Demo1 {
		int x=100;
		int y=200;
}

class Sample1 extends Demo1{
	void test(Demo1 arg) {
		System.out.println(arg);
		System.out.println(arg.x);
		System.out.println(arg.y);
	}
}
