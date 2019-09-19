package keyword;

public class TryCatchDemo {
	
//One try block can have multiple catch blocks

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
	try {	int c =a/b;
		System.out.println("The value of c:"+c);
	}catch(Exception e) {
		System.out.println("Exception is catched ");
	}finally
	{
		System.out.println("Finally is executed irrespective of try catch result ");
	}

	}

}
