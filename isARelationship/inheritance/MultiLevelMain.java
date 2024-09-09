package oops.isARelationship.inheritance;

public class MultiLevelMain {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		MultiLevel3 m1= new MultiLevel3();
		System.out.println("Accessing datas through MultiLevel3 class Object");
		System.out.println("A: "+m1.a+"\nX: "+m1.a+"\nP: "+m1.p);
		m1.disp();
		m1.test();
		m1.show();
		System.out.println("---------------------");
		MultiLevel2 m2= new MultiLevel2();
		System.out.println("Accessing datas through MultiLevel2 class Object");
		System.out.println("A: "+m2.a+"\nX: "+m2.a);
		System.out.println("---------------------");
		MultiLevel m3= new MultiLevel();
		System.out.println("Accessing datas through MultiLevel class Object");
		System.out.println("A: "+m2.a);
		System.out.println("Main Method Ended");
	}
}
