package oops.methodOverloading;

public class ABC {
		public static void main(String[] args) {
			System.out.println("Main Method String");
			main();
			main(new int[]{1, 2, 3});
			main(new double[]{1.0, 2.0, 3.0});
		}
		public static void main(int[] args) {
			System.out.println("Main Meth0d Int");
		}
		public static void main() {
			System.out.println("Main Method without argument");
		}
		public static void main(double[] arg) {
			System.out.println("Main Method double");
		}
}
