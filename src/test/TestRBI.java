package test;

public class TestRBI {

	public static void main(String[] args) {
		
		YesBank yb = new YesBank();
		yb.credit();
		yb.debit();
		yb.interest();
		
		RBI rb = new YesBank();
		rb.credit();
		rb.debit();
		

	}

}
