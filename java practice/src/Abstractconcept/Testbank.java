package Abstractconcept;

public class Testbank {

	public static void main(String[] args) {
		Hdfc h=new Hdfc();
		h.credit();
		h.debit();
		h.loan();
		
		
	Bank b	=new Hdfc();
	b.loan();
	b.credit();
	b.debit();

	}

}
