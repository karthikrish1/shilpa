package seleniumlocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class we {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	c.get("http://www.google.com");
	
	//facebook : links, images, div, input 
	
	//images=> img
	//links=> a
	// elements=> div, li , input, select
	

	List<WebElement> i1 = c.findElementsByTagName("a");
	System.out.println("Number of linkss "+ i1.size());
	
	//iterate through the links=> href
	for(WebElement x: i1)
	{
		System.out.println(x.getAttribute("href"));
	}
	c.quit();
}
}
