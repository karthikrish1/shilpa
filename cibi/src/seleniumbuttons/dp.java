package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dp {
	public static void main(String[] args) {
		
		// May 1 2023
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.get("https://jqueryui.com/datepicker/");
		c.switchTo().frame(0);
		c.findElementById("datepicker").click();
		for(int i=0;i<5;i++)
		{
		c.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
		}
		c.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[3]/a").click();
		
	}

}
