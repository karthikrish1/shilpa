package encpsulation;

public class c1 {
	
	/*encapsulation: hiding data 
	 * 
	 * declare the variable as private 
	 * must not assign value straightly to the variable
	 * access the variable through setters and getters 
	 * 
	 * setter, gettr, => nonstatic * 
	 * */

	private String password;
	
	public void setp(String p)
	{
		password=p;
	}
	
	public void getp()
	{
		System.out.println(password);
	}
}
