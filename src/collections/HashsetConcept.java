package collections;

import java.util.HashSet;
import java.util.Iterator;

// HashSet is class which implements Set interface
//It will allow to store duplicate object. Objects are stores in random order.


public class HashsetConcept {
	
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(10);
		System.out.println(hs);
		
		Iterator<Integer> it = hs.iterator();
					
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}
	

}
