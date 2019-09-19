package superkeyword;

public class ChildDemo extends ParentDemo{
	
	String name = "Child class name";

	public void getData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		
		ChildDemo cd = new ChildDemo();
		cd.getData();
		

	}

}
