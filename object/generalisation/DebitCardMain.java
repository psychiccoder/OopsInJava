package oops.object.generalisation;

public class DebitCardMain {
		public static void main(String[] args) {
			System.out.println("Main Method Started");
			Amazon am= new Amazon();
			 SBIDebitCard card1= new  SBIDebitCard("SBI",150000,123,14567289292l,"Manoj");
			 AxisDebitCard card2= new AxisDebitCard("Axis",200000,456,8278374827l,"Ajay");
			 card1.details();
			 System.out.println("--------------------");
			 card2.details();
			 System.out.println("----------------");
			 am.payment(card1, 50000);
			 System.out.println("-------------");
			 am.payment(card2, 10000);
			 card1.details();
			 System.out.println("--------------------");
			 card2.details();
			 
			System.out.println("Main Method Ended");
		}
}	
