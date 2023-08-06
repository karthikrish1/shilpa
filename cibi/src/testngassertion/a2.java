package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class a2 {

	@Test
	public void soft()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.get("http://www.google.com");
		SoftAssert s= new SoftAssert();
		s.assertEquals(c.getTitle(), "yahoo");
		s.assertNotEquals(c.getTitle(), "yahoo");
		WebElement ele = c.findElementByLinkText("Gmail");
		s.assertTrue(ele.isDisplayed());
		s.assertFalse(ele.isSelected());
		c.quit();
		s.assertAll();
	}
}
