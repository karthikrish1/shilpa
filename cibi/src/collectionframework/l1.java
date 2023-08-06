package collectionframework;

import java.util.ArrayList;

public class l1 {
	public static void main(String[] args) {
		
		/*list
		 *  
		 *  index based
		 *  add
		 *  remove
		 *  retrive 
		 *  iterate
		 *  accept duplicates
		 *  
		 *  syntax: 
		 *  
		 *  ArrayList<Datatype> name= new ArrayList<>();
		 *  
		 * int=> Integer
		 * dpuble=> Double
		 * String=> String
		 * boolean=> Boolean
		 ** 
		 * */
		ArrayList<Integer>l= new ArrayList<>();
		l.add(90);
		l.add(3);
		l.add(1);
		l.add(90);
		System.out.println(l);
		
		//indexx    0   1  2    3    
		//         90   3  1    90
		
		l.remove(1);
		System.out.println(l);
		
		System.out.println(l.get(2));
		
		//iteration: for each /enhanced for loop
		//for(datatyp e tempvarb: nameofthe c)
		for(int x:l)
		{
			System.out.println(x);
		}
	}

}
