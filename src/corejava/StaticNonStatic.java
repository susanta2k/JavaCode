package corejava;

public class StaticNonStatic {
	
	String name = "Tom";
	static int age = 25;

	public static void main(String[] args) {
	
// Static variable and method can be called directly or using class name 
// Static members can be called using object also but it will give warning 
// Non static members can only be allowed to access using object reference 

		sum();
		StaticNonStatic.sum();
		System.out.println(age);
		System.out.println(StaticNonStatic.age);

	}
	
	public void mail() {
		System.out.println("Send an email");
	}
	static void sum() {
		System.out.println("Sum method");
	}


}
