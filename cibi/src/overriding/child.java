package overriding;

public class child extends parent {

	public static void main(String[] args) {
		
		//call overriden method of parent
		parent p= new parent();
		p.area();
// call overriding method of child
		child c= new child();
		c.area();
		
	}
	
	//overriding method
	public void area()
	{
		int l=4;
		int b=40;
		System.out.println("area of rectangle is "+ l*b);
	}
}
