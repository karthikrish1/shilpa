package basics;

public class M1 {
	public static void main(String[] args) {
		
		M1.area();
		M1.average();
		//public: product of two numbers
		//private : addition of two numbers 
	}
	
	public static void area()
	{
		int l=10;
		int b=3;
		System.out.println("Area of rectangle is "+ l*b);
	}
	
	
	private static void average()
	{
		double a=8.9;
		double b=3.4;
		System.out.println("Average of two numebrs "+ (a+b)/2);
	}

}

/*
 * method:  block of code
 * 
 * static, nonstatic 
 * 
 * should be created outside the main method, inside the class
 * should be called inside the main method
 * 
 * static: fixed memory space
 * 
 * syntax for creation:  accessmodfier static returntype name(){}
 * syntax for calling:   classname.methodname();
 * 
 * 
 * 
 * */
