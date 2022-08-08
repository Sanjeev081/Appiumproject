package jpjpkj;

public class TestBank {

	public static void main(String[] args) {
		System.out.println(UsBank.min_bal);
		HsbcBank b=new HsbcBank();
		b.credit();
		b.Debid();
		b.educationloan();
		b.carloan();
		b.Mutualfund();
		
		UsBank b1=new HsbcBank();
		b1.credit();
		b1.Debid();
		b1.Transfermoney();
		
		
	}

}
