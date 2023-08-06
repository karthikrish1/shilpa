package overloading;

public class s2 {
	public static void main(String[] args) {
		s2 ob=new s2();
		ob.area();
		ob.area(3);
		ob.area(3.4);
		ob.area(3, 5.6);
		ob.area(3.2, 10);
		//overload nonstatic method and find average of two numbers, three numbers 
		}
	public  void area()
	{
		System.out.println("area");
		}
public  void area(int side)
	{
		System.out.println("area of square is "+ side*side);
		}
public void area(double r)
	{
		System.out.println("area of circle is "+ 3.14*r*r);
		}
public  void area(int l, double b)
	{
		System.out.println("area of rectangle is "+ l*b);
		}
public  void area(double b, int l)
	{
		System.out.println("area of triangle is "+ 0.5*l*b);
		}

}
