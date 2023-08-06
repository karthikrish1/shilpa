package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class s1 {

	public static void main(String[] args) {
		
		/*
		 * set
		 * 
		 * not indexed
		 * add
		 * remove
		 * retrival is not possible
		 * will not accept duplicate values
		 * 
		 * TreeSet         :    alphabetical/ascending order
		 * LinkedHashSet   :    insertion order
		 * HashSet         :    unpredictable order
		 * 
		  * 
		 * 
		 * */
		TreeSet<Integer>t= new TreeSet<>();
		t.add(80);
		t.add(3);
		t.add(234);
		t.add(12);
		t.add(56);
		System.out.println(t);
		
		
		LinkedHashSet<Integer>t1= new LinkedHashSet<>();
		t1.add(80);
		t1.add(3);
		t1.add(234);
		t1.add(12);
		t1.add(56);
		System.out.println(t1);
		
		HashSet<Integer>t11= new HashSet<>();
		t11.add(80);
		t11.add(3);
		t11.add(234);
		t11.add(12);
		t11.add(56);
		System.out.println(t11);
	}
}
