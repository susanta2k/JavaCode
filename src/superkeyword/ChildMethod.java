package superkeyword;

public class ChildMethod extends ParentMethod{
	
	public void getData(){
	
		System.out.println("Child method");
		super.getData();
	}
	public static void main(String[] args) {
		
		ChildMethod cm = new ChildMethod();
		cm.getData();
	}

}
