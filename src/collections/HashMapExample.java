package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "hello");
		hm.put(2, "welcome");
		hm.put(3, "test");
		hm.put(4, "world");
		hm.put(5, "span");
		hm.put(12, " ");
		hm.put(10, " ");
		System.out.println(hm);
		hm.remove(1, "hello");
		System.out.println(hm);
		System.out.println(hm.get(12));
		
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
	//		Map.Entry mp=(Map.Entry)it.next();
	//		System.out.println(mp.getKey());
	//		System.out.println(mp.getValue());
		}
	
	}

}
