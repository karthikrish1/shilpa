package collectionframework;

import java.util.Hashtable;
import java.util.TreeMap;

public class hrr {

	public static void main(String[] args) {
		
		Hashtable<Integer,String>t= new Hashtable<>();
		//t.add(true)
		t.put(90, "banana");
		t.put(9, "kite");
		t.put(19, "apple");
		t.put(30, "dog");
		System.out.println(t);
		
		//removal: know the key
		
		t.remove(19);
		System.out.println(t);
		
		System.out.println(t.get(90));
		
		System.out.println(t.keySet());
		System.out.println(t.values());
	}
}
