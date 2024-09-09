package oops.object.generalisation;

public class DebitCard {
		String bankName;
		double accbal;
		int cvv;
		long cardNum;
		String custnum;
		public DebitCard(String bankName, double accbal, int cvv, long cardNum, String custnum) {
			this.bankName = bankName;
			this.accbal = accbal;
			this.cvv = cvv;
			this.cardNum = cardNum;
			this.custnum = custnum;
		}
		void details() {
			System.out.println("Bank: "+bankName+"\nAccountBalance: "+accbal+"\nCvv: "+cvv+"\ncardNum: "+cardNum+"\nCustomer Name: "+custnum);
		}
}

class SBIDebitCard extends DebitCard{

	public SBIDebitCard(String bankName, double accbal, int cvv, long cardNum, String custnum) {
		super(bankName, accbal, cvv, cardNum, custnum);
	}
	
}

class AxisDebitCard extends DebitCard{

	public AxisDebitCard(String bankName, double accbal, int cvv, long cardNum, String custnum) {
		super(bankName, accbal, cvv, cardNum, custnum);
	}
	
}

class Amazon{
	void payment(DebitCard card, double billAmount) {
		if(card.accbal>billAmount) {
			card.accbal-=billAmount;
			System.out.println("Payment Success");
		}
		else {
			System.out.println("Payment failed, check the balance in card");
		}
	}
}

