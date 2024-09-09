package oops.isARelationship.inheritance;


// in java multiple inheritance is not supported as it leads to diamond problems
public class Multiple {
		int x=10;
		void test() {
			System.out.println("Test()");
		}
}
class Multiple2 {
	int y=20;
	void disp() {
		System.out.println("Disp()");
	}
}

//class Multiple3 extends Multiple Multiple2{
//	   doesn't support 
//}

