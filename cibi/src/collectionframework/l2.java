package collectionframework;

import java.util.ArrayList;

public class l2 {
public static void main(String[] args) {
	
	ArrayList<String>l= new ArrayList<>();
	l.add("ki");
	l.add("hi");
	l.add("li");
	l.add("ki");
	System.out.println(l);
	
	//indexx    0   1  2    3    
	//         ki   hi  li  ki   
	
	l.remove(1);
	System.out.println(l);
	
	System.out.println(l.get(2));
	
	//iteration: for each /enhanced for loop
	//for(datatyp e tempvarb: nameofthe c)
	for(String x:l)
	{
		System.out.println(x);
	}
}
}
