package basics;

public class cons {
	public static void main(String[] args) {
		cons ob= new cons();
	}
	
	public cons()
	{
		int s=90;
		int b=9;
		System.out.println("product is "+ s*b);
	}

}
/*
 * constructor
 *    special method
 *    takes classname as its name
 *    should be created outside the main method
 *    should be called inside the main method
 *    automatically called whenever an object is created
 *    syntx for creation:  accesmodifier classname(){}
 *    syntax for calling:  classname objectname= new classname();
* 
 * 
 * */
 