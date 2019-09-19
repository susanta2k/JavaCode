package interfaceExample;

public class Hdfcbank implements Rbibank{
	
	void hdfccash(){
		System.out.println("adsdasdasd");
	}

	public static void main(String[] args) {
		
		Hdfcbank hd = new Hdfcbank();
		hd.balance();
		hd.deposit();
		hd.withdral();
	
		}

	@Override
	public void deposit() {
		System.out.println("This is deposit method declared in RBibank interface and implemented in Hdfcbank");
		
	}

	@Override
	public void withdral() {
		System.out.println("This is withdral method declared in RBibank interface and implemented in Hdfcbank");
		
	}

	@Override
	public void balance() {
		System.out.println("This is balance method declared in RBibank interface and implemented in Hdfcbank");
		
	}

}
