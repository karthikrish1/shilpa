package testngattributes;

import org.testng.annotations.Test;

public class a1 {
	
	/*Testng=> Test Next Generation
	 *  
	 *  inspired from JUnit
	 *  test cases
	 *  run
	 *  automatic report generation
	 *  annotations
	 *  assertions
	 *  parallel testing
	 *  suite execution
	 *  
	 *  Testcases
	 *      nonstatic
	 *      @Test
	 *      default order: alphabetical order 
* 
*         priority : arrange the test case in particular order 
*         description: add information
*         groups
*         invocationcount
*         ignoring: disabling
*         timeout
	 * */

	
	@Test(priority=0,description="ONE",groups="U",invocationCount=5,enabled=false)
	public void t1()
	{
		System.out.println("Testcase 1");
	}
	
	@Test(priority=1,description="Two",groups="U")
	public void abc()
	{
		System.out.println("Testcase 2");
	}
	
	@Test(priority=2,description="Three",groups="K")
	public void t2()
	{
		System.out.println("Testcase 3");
	}
}
