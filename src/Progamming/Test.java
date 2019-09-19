package Progamming;

public class Test {

	public static void main(String[] args) {
	        String str = "Beginnersbook";
	        String reversed = reverseString(str);
	        System.out.println("The reversed string of Beginnersbook is: " + reversed);
	    }

	public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
