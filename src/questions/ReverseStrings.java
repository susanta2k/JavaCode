package questions;

public class ReverseStrings {

	public static void main(String[] args) {

//Without using StringBuffer class and reverse method
		String s = "WELCOME TO INDIA";
		int ln = s.length();
		String rev ="";
		for (int i=ln-1; i>=0;i--)
			{
			rev = rev+s.charAt(i);
								
			}
		System.out.println("The reverse string of helloworld is:"+rev);
		
//	Using StringBuffer class and reverse method
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println("The reverse string of helloworld is:"+ sf.reverse());
	}

}
