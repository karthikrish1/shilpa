package multilevel;

public class child extends parent{


//parent<=> child<=> grandchild
	
	public static void c2s()
	{
		System.out.println("child class static method");
	}
	
	public void c2n()
	{
		System.out.println("child class nonstatic method ");
	}
}
