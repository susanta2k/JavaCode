package Progamming;

public class ReverseString {

public static void main(String[] args) {
		String s1 = "welcome";
		StringBuilder sb = new StringBuilder(s1);
		StringBuilder s2 = sb.reverse();
		System.out.println(s2);
		
		if(s1.equals(s2)) 
			System.out.println("The string is palindrome");
		else
			System.out.println("The string is not a palindrome");
		

	}
	

}
