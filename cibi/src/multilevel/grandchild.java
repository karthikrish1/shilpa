package multilevel;

public class grandchild extends child{
public static void main(String[] args) {
		
	// calling its own method
	grandchild.gs();
	grandchild g= new grandchild();
	g.gn();
	
	//after inheritance
	g.c2n();
	grandchild.gs();
	
	// as child is connected with parent
	g.pn();
	grandchild.ps();
	
	}

	public static void gs()
	{
		System.out.println("grandchild class static method");
	}
	
	public void gn()
	{
		System.out.println("grandchild class nonstatic method ");
	}
}
