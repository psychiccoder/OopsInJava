package oops.singletonClass;

public class Calci {
		private static Calci ref;

		private Calci() {
		}
		
		public static Calci getInstance() {
			if(ref==null) {
				ref= new Calci();
			}
			return ref;
		}
		public void divide(int n,int m) {
			System.out.println("Dividing "+n+" by "+m);
			int res= n/m;
			System.out.println("result is "+res);
		}
}
