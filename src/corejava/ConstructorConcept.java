package corejava;

public class ConstructorConcept {
	// Method with same class name is called Constructor but not same as method
	// Multiple Constructors with different parameters can be defined
	// Constructor is used to initialize the class variables and the keyword used is
	// called "this"
	// Constructor would not return any value
	// Class variables or instance variables
	int age = 35;
	String name = "Pramod";

	ConstructorConcept() {
		System.out.println("Default Constructor with zero parameter");
	}

	ConstructorConcept(int i) {
		System.out.println("Constructor with one parameter");
		System.out.println(i);
	}

	ConstructorConcept(int i, int j) {
		System.out.println("Constructor with two parameters");
		System.out.println(i + " " + j);
	}

	ConstructorConcept(int age, String name) {
		System.out.println("Constructor with local variables:");
		this.name = name;
		this.age = age;
		System.out.println(age);
		System.out.println(name);

	}

	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(20, 30);
		ConstructorConcept obj3 = new ConstructorConcept(45, "sanny");
	}

}
