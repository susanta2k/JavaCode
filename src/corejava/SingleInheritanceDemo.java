package corejava;

public class SingleInheritanceDemo {
	public static void main(String [] args){
		
	}

}

class Bird{
	void eat(){
		System.out.println("Eating ");
	}
}

class Cow extends Bird{
	void barking(){
		System.out.println("Barking ");
	}
}
