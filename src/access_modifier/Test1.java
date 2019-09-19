package access_modifier;

public class Test1 {
	
	private int a =10;
	protected int b = 20;
	public int c = 30;
	int d =40;
	public void run() {
		System.out.println("run method called");
		
	}

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		
		
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t1.c);
		System.out.println(t1.d);
		
	}

}
