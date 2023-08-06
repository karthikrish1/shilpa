package testngattributes;

import org.testng.annotations.Test;

public class t11 {
	
	@Test(timeOut=2000)
	public void ab() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("hi");
	}

}
