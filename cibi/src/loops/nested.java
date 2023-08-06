package loops;

public class nested {
public static void main(String[] args) {
	/*
	 * if(condition1)
	 * {
	 * con1 true
	 * }
	 * 
	 * else if(cond2)
	 * {
	 * cond2 true
	 * }
	 * 
	 * else
	 * {
	 * false
	 * }
	 * 
	 * a,b,c
	 * 
	 * a>b && a>c   => a is bigger
	 * 
	 * b>a && b>c=> b is bigger 
	 * 
	 * c && bigger
	 * 
	 * */
	
	int age=18;
	if(age>18)
	{
		System.out.println("major");
	}
	else if(age<18)
	{
		System.out.println("minor");
	}
	else
	{
		System.out.println("age is 18");
	}
	
	
	}
}

