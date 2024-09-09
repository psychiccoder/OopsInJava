package oops.isARelationship.inheritance;

public class MultiLevel {
		int a=100;
		void test() {
			System.out.println("Test");
		}
}
class MultiLevel2 extends MultiLevel{
	int x= 200;
	void disp() {
		System.out.println("Disp()");
	}
}

class MultiLevel3 extends MultiLevel2{
	int p=300;
	void show() {
		System.out.println("Show()");
	}
}