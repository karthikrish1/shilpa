package inhr;

public class child extends parent {
public static void main(String[] args) {
	
	child.cs();
	child c= new child();
	c.cn();
	
	//after inheritance
	child.ps();
	c.pn();
	
}

public static void cs()
{
	System.out.println("child class static method");
}

public void cn()
{
	System.out.println("child class nonstatic method ");
}
}
