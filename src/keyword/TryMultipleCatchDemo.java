package keyword;

// A single try block can 

public class TryMultipleCatchDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int array[] = new int[5];
		
	try {	
		
		int c =a/b;
//		System.out.println(array[6]);
		System.out.println("The value of c is printed:");
	}	
	catch(ArithmeticException ae)
	{
		System.out.println("ArithmeticException is catched ");
		
	}catch(IndexOutOfBoundsException ie) 
	{
		System.out.println("IndexOutOfBoundsException is catched ");
		
	}catch(Exception e) 
	{
		System.out.println("Exception is catched ");
	}

	}

}
