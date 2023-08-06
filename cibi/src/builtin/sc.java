package builtin;

import java.util.Scanner;

public class sc {
	public static void main(String[] args) {
		
		/*scanner: get input from the user at run time
		 * nonstatic 
		 * int=> nextInt()
		 * string=> nextLine()
		 * double=> nextDouble()
		 * boolean=> nextBoolean()
	* 
		 * */
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = s.nextLine();
		
		System.out.println("Enter your age:");
		int age=s.nextInt();
		
		System.out.println("Enter your salary: ");
		double sal = s.nextDouble();
		
		System.out.println("Name is "+ name);
		System.out.println("age is "+ age);
		System.out.println("salary is "+ sal);
	}

}
