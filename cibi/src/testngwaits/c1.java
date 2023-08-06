package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class c1 {
	
	/* create an bject for webdriver wait class
	 * pass driver instance and time limit as input
	 * call untill method
	 * call expected conditions 
	 * 
	 * 
	 * 
	 * code is correctm if it executes within time limit, it will not wait for completion of time limit
	 * code is wrong, it will wait for completion of time limit, then it will throw up error 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

	@Test()
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.get("http://www.google.com");
		WebDriverWait w= new WebDriverWait(c,5);
		
		//title
		//w.until(ExpectedConditions.titleIs("yahoo")); //5
		//w.until(ExpectedConditions.titleContains("oo"));
		
		// presence of alert
		//w.until(ExpectedConditions.alertIsPresent());
		
		// visibility of an element
		// finding the element and checking its visibility
	   //	w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		
		// collect all the images, check its visibility
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
		
		//clickable /not
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
		
		c.quit();

}}
