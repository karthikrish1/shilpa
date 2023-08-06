package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class s1 {
	public static void main(String[] args) {
		/*A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
        Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
        
        *
*map: The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
List number = Arrays.asList(2,3,4,5);
List square = number.stream().map(x->x*x).collect(Collectors.toList());


filter: The filter method is used to select elements as per the Predicate passed as argument.
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());


sorted: The sorted method is used to sort the stream.
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().sorted().collect(Collectors.toList());
        *
        *
        *
        *
        *
        */
		
		// create a list of integers: number of input= number of output
	    List<Integer> number = Arrays.asList(2,3,4,5,10);// NUMBER=[2,3,4,5,10]
	  
	    // demonstration of map method
	    List<Integer> square = number.stream().map(x -> x+5).                     //multiply each value by 2 x=> x*2
	                           collect(Collectors.toList());
	    System.out.println(square);
	   
	    //n=[1,2,3,4,5,6,7,8]
	    //filter the values that are greater than 5    s-> s>5
	    
	   //FILTER       
	    List<String> names =
                Arrays.asList("kirthika","dhivya","deepa","prem","sowmiya");
  
    // demonstration of filter method
     List<String> result = names.stream().filter(s->s.startsWith("s")).   // d
                          collect(Collectors.toList());
    System.out.println(result);
       
    
    //SORTED
    List<String> show =
            names.stream().sorted().collect(Collectors.toList());
    System.out.println(show);
    
    
    //REDUCE
    //l=[20,21,22,23,24...30]
    // add all the numbers that are divisble by 3
    List<Integer> number1 = Arrays.asList(2,3,8,10,12);
    int ADDITIONOFodd =
    	       number1.stream().filter(x->x%2!=0).reduce(0,(ans,i)-> ans+i);
    	  
    	    System.out.println(ADDITIONOFodd);
    	    
    	    int ADDITIONOFeven =
    	    	       number1.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
    	    	  
    	    	    System.out.println(ADDITIONOFeven);
    	    
    	    
    	int s=    number1.stream().filter(x->x>6).reduce(0,(ans,i)-> ans+i);
      	  
    	    System.out.println(s);
    	    
    	    // print the values which is less than 6
    	    
    	    
    	    // filter and reduce:   less than 4 :  add 
    	     
  
	    
	    
	}

}
