package Interr;

public class c1 implements Intro{
public static void main(String[] args) {
	
	c1 ob= new c1();
	ob.ab();
	ob.area();
	
	// abstract method: area of circle
	// default nonstatic: area of triangle 
}

@Override
public void ab() {
	System.out.println("abstract method");
	
}
}
