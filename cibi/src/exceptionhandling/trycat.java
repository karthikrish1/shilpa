package exceptionhandling;

public class trycat {
	public static void main(String[] args) {
		
		//try: prob of getting error
		// catch: handle the exception, will be executed only when error occurs
		
		try {
		System.out.println(3/1);
		}
		catch(Exception e)
		{
		System.out.println("Error is " + e);	
		}
	}

}
