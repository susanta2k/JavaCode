package abstractionConcept;

public class HDFCBank extends Bank{
	
	
	public void loan() {
		System.out.println("Loan method implemented in HDFCBank");
	}
	public void interest() {
		System.out.println("Interest method implemented in HDFCBank");
	}
	public void credit() {
		System.out.println("HDFCBank Override Bank credit method");
	}
	public void debit() {
	System.out.println("HDFCBank Override Bank debit method");
	}
	public void hdfc_balance() {
		System.out.println("HDFC balance");
	}
}

