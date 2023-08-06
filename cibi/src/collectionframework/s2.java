package collectionframework;

import java.util.TreeSet;

public class s2 {
	public static void main(String[] args) {
		//LinkedHashSet=> Double 
		TreeSet<String>t= new TreeSet<>();
		t.add("banana");
		t.add("dog");
		t.add("zebra");
		t.add("apple");
		System.out.println(t);
		
		t.remove("zebra");
		System.out.println(t);
		
		for(String x: t)
		{
			System.out.println(x);
		}
	}

}
