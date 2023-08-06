package testngdepde;

import org.testng.annotations.Test;

public class d2 {

	@Test(priority=0,groups="M")
	public void user()
	{
		System.out.println("Entering username ");
	}
	
	@Test(priority=1,groups="M")
	public void pass()
	{
		System.out.println("entering password");
	}
	
	@Test(priority=2,groups="M")
	public void lg()
	{
		System.out.println("clicking on login");
	}
	
	@Test(priority=3,dependsOnGroups="M")
	public void homee()
	{
		System.out.println("home");
	}
	
	//Groups: M   : all pass     home: pass
	// Group=? 1 fail            home: skipped 
}
