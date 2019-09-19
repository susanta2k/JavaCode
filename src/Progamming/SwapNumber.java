package Progamming;
import java.util.Scanner;

public class SwapNumber {
	public static void main (String args[]){
		
		int a =0 , b=0 , c= 0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter First number:");
		a = scan.nextInt();
		System.out.println("Enter Second number:");
		b = scan.nextInt();
		System.out.println("First number:" + a);
		System.out.println("Second number:" + b);
		
		c = b;
		b = a;
		a = c;
		System.out.println("Swaping number is");
		System.out.println("First number:" + a);
		System.out.println("Second number:" + b);
		
		
	}

}
