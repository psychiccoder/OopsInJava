package oops.methodOverriding;

public class Demo7 {
		static void wish() {
			System.out.println("Hello");
		}
		void disp() {
			System.out.println("Disp");
		}
}

class Demo8 extends Demo7{
	static void wish() {
		System.out.println("Hi......");
	}
	void disp() {
		System.out.println("Static disp");
	}
}
