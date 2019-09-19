package constructor;

public class Student {
	
	int sRollno;
	String sName;
	
	public void sData() {
		System.out.println(sRollno+" "+sName);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sData();

	}

}
