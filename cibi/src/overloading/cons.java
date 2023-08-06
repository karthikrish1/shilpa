package overloading;

public class cons {
public static void main(String[] args) {
	
	cons ob= new cons();
	cons ob1= new cons(3);
	cons ob2= new cons(3.4);
    cons ob3= new cons(4,3.2);
	cons ob4= new cons(4.3,20);
	
	
	
}

public cons()
{
	System.out.println("constructor");}

public cons(int s)
{
	System.out.println("area of squre is "+ s*s);}

public cons(double r)
{
	System.out.println("area of circle is "+ 3.14*r*r);}

public cons(int l, double b)
{
	System.out.println("Area of rectangle "+ l*b);}

public cons(double b, int l)
{
	System.out.println("area of trinagle is "+ 0.5*l*b);}
}
