package abstractionConcept;

//abstraction means hiding the implementation logic 
// abstract class contains keyword abstract before the class name
// abstract class can contains abstract method and non abstract method (concrete method)
// abstract class can have class members like Private and Protected etc
//object can't be instantiated from abstract class
//Abstract can extends another class and implements multiple interfaces
//Abstract class can have final, non final, static and non static variables.

public abstract class Bank {
		
	public int age = 30;
	protected String name = "Srihari";
	public String dept = "Engineering";
		
		public abstract void loan();
		public abstract void interest();
		
		public void credit() {
			System.out.println("Credit method from Bank abstract class");
		}
		public void debit() {
			System.out.println("Debit method from Bank abstract class");
		}
		public void UserDetails() {
			
			System.out.println("Bank user details:");
		}
		
	}