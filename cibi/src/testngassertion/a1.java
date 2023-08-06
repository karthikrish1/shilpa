package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testnglistener.l1.class)
public class a1 {
	//technique :comparing actual result with obtained result
	
	/*hard asserts 
	 *     provided by assert builtin class
	 *     static in nature
	 *     if assertion fails, it will not proceed furthe
	* sftwasserts
	 *     provided by softassert builtin class
	 *     nonstatic in nature
	 *     if assertion fails, it will proceed further
	 *     know the actual result: invoke assertAll()
	 *     
	 *     
	 * assertTrue(condition)
	 * assertFalse(condition)
	 * assertEquals(actual, expected)
	 * assertNotEquals(actual, expected)* 
	 * */
	
	@Test
	public void hard()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.get("http://www.google.com");
		//Assert.assertEquals(c.getTitle(), "yahoo");
		//Assert.assertNotEquals(c.getTitle(), "yahoo");
		WebElement ele = c.findElementByLinkText("Gmail");
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		c.quit();
	}

}
