package hierrarchial;

public class c1 extends h1 {

public static void main(String[] args) {
		
	// own methods
	c1.c1s();
	c1 ob= new c1();
	ob.c1n();
	
	// 
	c1.ps();
	ob.pn();
	
	}

	public static void c1s()
	{
		System.out.println("child1 class static method");
	}
	
	public void c1n()
	{
		System.out.println("child1 class nonstatic method ");
	}
}
