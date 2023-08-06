package overloading;

public class s1 {
public static void main(String[] args) {
	
	/*inheritance
	 *polymorphism
	 *abstraction
	 *encapsulation
	 *
	 *polymorphims=> many forms
	 *
	 *overloading and overriding 
	 *
	 *overloading : using same methodname for different purpose showing difference in 
	 *              number /datatype/sequence 
	 *              
	 *              static
	 *              nonstatic
	 *              constructor * 
	 * */
	
	s1.area();
	s1.area(3);
	s1.area(4.5);
	s1.area(3,4.5);
	s1.area(2.3, 40);
	// overload static method and find perimter of square, circle and rectangle 
}

public static void area()
{
	System.out.println("area");
	}

public static void area(int side)
{
	System.out.println("area of square is "+ side*side);
	}

public static void area(double r)
{
	System.out.println("area of circle is "+ 3.14*r*r);
	}

public static void area(int l, double b)
{
	System.out.println("area of rectangle is "+ l*b);
	}

public static void area(double b, int l)
{
	System.out.println("area of triangle is "+ 0.5*l*b);
	}
}
