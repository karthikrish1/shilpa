package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class m1 {
	public static void main(String[] args) {
		
		/*
		 * Map:  container : elements will be stored along with its key
		 * 
		 * key: any datatype
		 * element: any datatype
		 * 
		 * add
		 * remove
		 * retrieve
		 * 
		 * TreeMap          : keys will be sorted in ascendind order/alphabetical order
		 * LinkedHashmap    : keys will be sorted in insertion order
		 * HashMap          : keys will be in unpredictable order
		 * 
		 * TreeMap<dtype of key, dtypeofELe> name= new TreeMap<>();
		 * 
		 * 
		 * Key: Integer
		 * element: String
		 
		 * */
		TreeMap<Integer,String>t= new TreeMap<>();
		t.put(90, "banana");
		t.put(9, "kite");
		t.put(19, "apple");
		t.put(30, "dog");
		System.out.println(t);
		
		LinkedHashMap<Integer,String>t1= new LinkedHashMap<>();
		t1.put(90, "banana");
		t1.put(9, "kite");
		t1.put(19, "apple");
		t1.put(30, "dog");
		System.out.println(t1);
		
		HashMap<Integer,String>t11= new HashMap<>();
		t11.put(90, "banana");
		t11.put(9, "kite");
		t11.put(19, "apple");
		t11.put(30, "dog");
		System.out.println(t11);
		
		
	}

}
