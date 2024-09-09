package oops.initializationStatesOfObjects.blocks;

public class Demo3 {
		int x;
		int y;
		static int a;
		static int b;
		static {
			System.out.println("static blocks");
			a=10;
			b=20;
		}
		{
			System.out.println("non-static block");
			x=100;
			y=200;
			
		}
}
