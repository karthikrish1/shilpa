package basics;

public class m2 {
public static void main(String[] args) {
	
	// other than void:  int, float, double, boolean, string,char
	//creation: add return statement at the end
	// calling:  sysout statement
	
	System.out.println(m2.pro());
	System.out.println(m2.area());
	
	//public:  area of circle
	//private:div of 2 numbers
}

public static int pro()
{
	int a=9;
	int b=8;
	int c=a*b;
	return c;
	}

private static double area()
{
	double a=8.2;
	double s=a*a;
	return s;
	}
}
