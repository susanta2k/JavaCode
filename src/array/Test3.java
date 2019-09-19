package array;

import access_modifier.Test1;

public class Test3 extends Test1{

	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		
		//System.out.println(t3.a); // Variable a is not accessible as it is private member of class Test1. Private member can't be access outside the class
		System.out.println(t3.b); //Variable b is accessible as it is protected member of Test1 and Test3 is the child class
		System.out.println(t3.c); // Variable c is accessible everywhere as it is public member of Test1
		//System.out.println(t3.d); // Variable d is not accessible as it is default member of Test1, can't be access outside the package
		t3.run();
	}

}
