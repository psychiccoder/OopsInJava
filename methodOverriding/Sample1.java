package oops.methodOverriding;

public class Sample1 {
	void wish() {
		System.out.println("Hello all");
	}
}

class Sample2 extends Sample1{
	void wish() {
		System.out.println("Hi all.......");
	}
	void wish(String wish) {
		System.out.println(wish);
	}
}
