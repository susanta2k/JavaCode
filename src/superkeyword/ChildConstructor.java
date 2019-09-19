package superkeyword;

public class ChildConstructor extends ParentConstructor{
	
	
	public ChildConstructor() {
		super();
		System.out.println("This is child class constructor");
		
	}
	public static void main(String[] args) {
		
		ChildConstructor cc = new ChildConstructor();
		
	}

}
