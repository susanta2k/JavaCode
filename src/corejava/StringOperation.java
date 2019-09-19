package corejava;

public class StringOperation {
	public static void main(String [] args){
		String str = "Hello World";
		String ntr = "This is not first string printed";
		int strlen = str.length();
		String strlc = str.toLowerCase();
		String struc = str.toUpperCase();
		String strrep = str.replace('s', 'a');
//		int strcom = str.compareTo(ntr);
		System.out.println(str);
		System.out.println(strlen);
		System.out.println(strlc);
		System.out.println(struc);
		System.out.println(strrep);
	}
}
