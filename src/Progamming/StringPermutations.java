package Progamming;

public class StringPermutations { 
	
	public static void main(String[] args) 
	{ 
		String str = "ABCD"; 
		printPermutation(str, ""); 
	}

	// Function to print all the permutations of str 
	static void printPermutation(String str, String ans) 
	{ 

		// If string is empty 
		if (str.length() == 0) { 
			System.out.print(ans + " "); 
			return; 
		} 

		for (int i = 0; i < str.length(); i++) { 

			// ith character of str 
			char ch = str.charAt(i); 

			// Rest of the string after excluding 
			// the ith character 
			String ros = str.substring(0, i) + 
						str.substring(i + 1); 

			// Recurvise call 
			printPermutation(ros, ans + ch); 
		} 
	} 
	
} 
