package Progamming;

import java.util.Scanner;

public class Palindrome {

	public static void main (String[] args) {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		int ln;
		System.out.println("Enter the number or String");
		original = in.nextLine();
		ln = original.length();
		for (int i =ln-1; i>=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println("The reverse string is:" +reverse);
		
		if(original.equals(reverse)) 
			System.out.println("The string is palindrome");
		else
			System.out.println("The string is not a palindrome");
		
	}
}
