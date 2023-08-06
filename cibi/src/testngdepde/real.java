package testngdepde;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class real {
	ChromeDriver c;
	@Test(priority=0, description="Visiting website ",groups="K")
	public void visitingwebsite()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		 c= new ChromeDriver();
		c.get("http://www.seleniumeasy.com");//1
	}
	
	@Test(priority=1, description="maximising website ",groups="K")
	public void max()
	{
		c.manage().window().maximize();
	}
	
	@Test(priority=2, description="refreshingwebsite ",invocationCount=3,groups="K")
	public void refre()
	{
		c.navigate().refresh();
	}
	
	@Test(priority=3, description=" clicking on Maven ",dependsOnGroups="K")
	public void clicking()
	{
		c.findElementByLinkText("Maven").click();
	}
	
	@Test(priority=4, description="closing website ",timeOut=4000,dependsOnGroups="K")
	public void quit() throws InterruptedException
	{
		Thread.sleep(3000);
		c.quit();
	}

}
