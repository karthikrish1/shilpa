package basics;

public class m5 {
public static void main(String[] args) {
	
	//paramter: variable passed to a function definition
	//argument: value assigned to the paramter while calling it
	// number of paramters= number of arguments
	
	m5.area(5);
	m5 ob=new m5();
	ob.display("dhivya", 30);
	
	//static:  average of three numbers
	// nonstatic: area of triangle
}

public static void area(int s)//s=> parameter
{
	System.out.println("Area of square is "+ s*s);
	}

public void display(String name, int age)
{
	System.out.println("Name is "+ name);
	System.out.println("Age is "+ age);}
}
