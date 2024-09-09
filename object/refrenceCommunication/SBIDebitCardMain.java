package oops.object.refrenceCommunication;

public class SBIDebitCardMain {
		public static void main(String[] args) {
			Amazon am= new Amazon();
			 SBIDebitCard card1= new SBIDebitCard("SBI",1123.23,211,1234292);
			 am.payment(card1, 100);
			 card1.details();
			
		}
}
