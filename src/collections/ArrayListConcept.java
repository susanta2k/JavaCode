package collections;

// ArrayList is dynamic in nature unlike Array which is static in nature (cann't increase and decrease the size of the array)
//Can contains duplicate value and maintains insert order 
//Synchronized and slow 
//Allows to random access to value as it is stores its value on the basis of index
//To print all values of an array list we used for loop or iterator 

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
			
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(30);
		System.out.println(ar);
		System.out.println("The size of the ArrayList ar is: "+ar.size());
		
		int i;
		for(i =0; i<ar.size();i++)
			System.out.println(ar.get(i));
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("name");
		ar1.add("rollno");
		ar1.add("rollno");
		System.out.println(ar1);
		ar1.add(0, "student");
		System.out.println(ar1);
		
		Iterator<String> r = ar1.iterator();
		while (r.hasNext()){
			System.out.println(r.next());
		}
		
		ArrayList<Boolean> ar3 = new ArrayList<Boolean>();
		ar3.add(true);
		ar3.add(false);
		
		
	
	}

}
