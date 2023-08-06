package testngannotations;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {
	/*
	 * before test:   run only once before all the test cases started its execution
	 * after test:    run only once after all the test cases finished its execution
	 * 
	 * 
	 * before class: run only once after before test 
	 * after class: run only once before after test 
	 * 
	 * before method: run before each test case
	 * after method:  run after each test case 
	 * 
	 * 
	 * before test   : visiting website 
	 *  before class : maximising 
	 *       before method: refreshing    tc1- title      aftermethod  : deleting cookies 
	 *       before method :refreshing    tc2- clicking   after method  : deleting cookies 
	 *  after class  : resizing 
	 * after test    : closing website 
	 * 
	  * 
	 * */
	ChromeDriver c;
	@BeforeMethod
	public void bm()
	{
		System.out.println("before method");
		c.navigate().refresh();
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("after method");
		c.manage().deleteAllCookies();
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("before class");
		c.manage().window().maximize();
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("after class");
	Dimension d= new Dimension(300,400);
	c.manage().window().setSize(d);
	}
	
	@Test(priority=0)
	public void t1()
	{
		System.out.println("Test case 1");
		System.out.println(c.getTitle());
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("before test ");
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		 c= new ChromeDriver();
		 c.get("http://www.google.com");
	}
	
	@AfterTest
	public void at() throws InterruptedException
	{
		System.out.println("after test ");
		Thread.sleep(3000);
		c.quit();
	}
	
	@Test(priority=1)
	public void t2()
	{
		System.out.println("Test case 2");
		c.findElementByLinkText("Gmail").click();
	}

}
