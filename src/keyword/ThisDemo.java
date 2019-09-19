package keyword;
// This keyword is used to access the class variable inside the method

public class ThisDemo {
	
	int a = 10;
	
	void getData(){
		
		int a = 20;
		
		System.out.println("Printing the value of local variable:"+a);
		System.out.println("Printing the value of class variable:"+this.a);
		
	}
	
	public static void main(String[] args) {
				
		ThisDemo td = new ThisDemo();
		td.getData();
		

	}

}
