package basics;

public class m4 {
	public static void main(String[] args) {
		
		
		// other than void-> int, float, double....
		
		//creation: add return statement at the end
		//calling: sysout 
		m4 ob= new m4();
		System.out.println(ob.add());
		System.out.println(ob.prod());
		
		//public: return perimter of square
		//private: return division of two numbers 
	}
	
	public int add()
	{
		int a=4;
		int b=3;
		int c=a+b;
		return c;
	}

	private double prod()
	{
		double a=4.5;
		double b=3.4;
		double c=a*b;
		return c;
	}
}
