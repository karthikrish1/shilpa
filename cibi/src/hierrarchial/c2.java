package hierrarchial;

public class c2 extends h1 {
	
	public static void main(String[] args) {
	
		c2.c2s();
		c2 ob= new c2();
		ob.c2n();
		
		//after inheritance
		c2.ps();
		ob.pn();
	
	}
	

	public static void c2s()
	{
		System.out.println("child2 class static method");
	}
	
	public void c2n()
	{
		System.out.println("child2 class nonstatic method ");
	}
}
