package abstractionConcept;

public class TestBank{

	public static void main(String[] args) {
		
	HDFCBank bn = new HDFCBank();
	bn.credit();
	bn.debit();
	bn.interest();
	bn.loan();
	bn.hdfc_balance();
	
	System.out.println("------------------------------");
	
	SBIBank sbn = new SBIBank();
	sbn.credit();
	sbn.debit();
	sbn.interest();
	sbn.loan();
	sbn.SBI_balance();
	sbn.UserDetails();
	System.out.println("------------------------------");
	
	Bank b = new HDFCBank();
	b.credit();
	b.debit();
	b.loan();
	b.interest();
	int ag =b.age;
	String dp = b.dept;
	System.out.println(ag);
	

	}

}

