package corejava;

public class InheritanceHeirarchicalDemo {
	
	public static void main(String[] args){
	Dog d = new Dog();
	d.barking();
	d.vow();
	Cat c = new Cat();
	c.barking();
	c.meow();
		
	}
}

class Animal
{
	void barking(){
		System.out.println("Barking Animal");
	}
}
class Dog extends Animal{
	void vow(){
		System.out.println("Vow vow");
	}
}
class Cat extends Animal{
	void meow(){
	System.out.println("Meow Meow");
}

	}
	

