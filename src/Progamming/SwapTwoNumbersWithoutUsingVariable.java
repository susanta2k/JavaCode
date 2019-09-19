package Progamming;

import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingVariable {

	public static void main(String[] args) {
		int x, y;
		System.out.println("Enter x and y");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		System.out.println("Before swapping the value of \nx = "+ x + "\ny = " + y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping the value of \nx = "+ x + "\ny = " + y);

	}

}
