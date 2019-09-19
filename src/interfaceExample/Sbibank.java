package interfaceExample;

public class Sbibank implements Rbibank,Rbibank2{
	
	public void sbideposit() {
		System.out.println("This is sbideposit method declared in Sbibank");
	}

	public static void main(String[] args) {
		
		Sbibank sb = new Sbibank();
		sb.balance();
		sb.deposit();
		sb.withdral();
		sb.cash();
		sb.gold();
		
		
		Rbibank rb = new Sbibank();
		rb.balance();
		rb.deposit();
		rb.withdral();
		
		

	}

	@Override
	public void deposit() {
		System.out.println("This is deposit method declared in RBibank interface and implemented in Sbibank");
		
	}

	@Override
	public void withdral() {
		System.out.println("This is withdral method declared in RBibank interface and implemented in Sbibank");
		
	}

	@Override
	public void balance() {
		System.out.println("This is balance method declared in RBibank interface and implemented in Sbibank");
		
	}

	@Override
	public void cash() {
		System.out.println("This is cash method declared in RBibank2 interface and implemented in Sbibank");
		
	}

	@Override
	public void gold() {
		System.out.println("This is gold method declared in RBibank2 interface and implemented in Sbibank");
		
	}

}
