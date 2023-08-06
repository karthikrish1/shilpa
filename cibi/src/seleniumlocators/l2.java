package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.get("http://www.google.com");
		
		//word/words-> click=> a new url will be opened
		// linktext
		//partial linktext- > substring of linktext 
		
	//	c.findElementByLinkText("Images").click();
		
		c.findElementByPartialLinkText("Im").click();
		
	}

}
