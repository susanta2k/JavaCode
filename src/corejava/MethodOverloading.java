package corejava;

public class MethodOverloading {
	public static void main(String [] args){
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(50);
		obj.sum(10, 20);
		
	}
// Main method can be overloaded with different argument
// You can not create a method inside a method
//Method Overloading: when the method name is same with different argument within the same class	
	public void sum() {
		
		System.out.print("Sum method with no parameter");
		}
	public void sum(String s) {
		
		System.out.print("Sum method with one parameter with String data type");
		}
	public void sum(int a) {
		
		System.out.print("Sum method with one parameter"+ a);
		}
	public void sum(int a, int b) {
		
		System.out.print("Sum method with two parameters"+ a);
		
		}
}
