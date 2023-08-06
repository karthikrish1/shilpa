package basics;

public class m3 {
	
	public static void main(String[] args) {
		
		//classname objetname=new clssname();
		// objectname.methodname();
		
		m3 ob= new m3();
		ob.area();
		ob.prod();
		
	//public:  area of rectangle
	// private: perimter of square 
		
	}

	public void area()
	{
		int s=3;
		System.out.println("Square "+ s*s);
	}
	
	
	private void prod()
	{
		double a=4.5;
		double b=2.3;
		System.out.println("product is "+ a*b);
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
 * nonstatic: doesnot contain fixed memory space
 * 
 * syntax for creation:  accessmodfier  returntype name(){}
 * syntax for calling:  
 * 
 * step1: creation and naming of object:   classname objectname= new classname();
 * step2:                                  objectname.mthodname();
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */