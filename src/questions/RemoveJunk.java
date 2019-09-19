package questions;

public class RemoveJunk {

	public static void main(String[] args) {
		String s = "@$$%%adasda 54645645 ()&&&&*&";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
