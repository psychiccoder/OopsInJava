package oops.object.refrenceCommunication;

public class SBIDebitCard {
	String bankName;
	double accbal;
	int cvv;
	long cardNum;
	public SBIDebitCard(String bankName, double accbal, int cvv, long cardNum) {
		this.bankName = bankName;
		this.accbal = accbal;
		this.cvv = cvv;
		this.cardNum = cardNum;
	}
	void details() {
		System.out.println("Bank: "+bankName+"\nAccountBalance: "+accbal+"\nCvv: "+cvv+"\ncardNum: "+cardNum);
	}
	
}

class Amazon{
	void payment( SBIDebitCard  card, double billAmount) {
		System.out.println("Payment Of Rs "+billAmount+"Processing ");
		if(card.accbal>billAmount) {
			card.accbal=card.accbal-billAmount;
			System.out.println("Payment Success");
		}
		else {
			System.out.println("Payment Failed, check the balance int the card");
		}
	}
}

