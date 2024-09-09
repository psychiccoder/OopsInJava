package oops.initializationStatesOfObjects.constructors;

public class InstaAccMain {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		InstaAcc i1= new InstaAcc("abc","abc@gmail",123456789,"qwefiwegu");
		InstaAcc i2= new InstaAcc("def",12897789,"ffiuif");
		InstaAcc i3= new InstaAcc("ghi","ghi@gmail","qwefiwegu");
		i1.showDetails();
		System.out.println("--------------");
		i2.showDetails();
		System.out.println("--------------");
		i3.showDetails();
		
		System.out.println("Main Method Ended");
	}
}
