package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l1 {

	public static void main(String[] args) {
		/*
		 * locators  : 8
		 * 
		 * id
		 * name
		 * classname: not preferred
		 * 
		 * linktext
		 * partial linktext
		 * tagname
		 * xpath
		 * css
		 * 
		 * */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.get("http://www.mycontactform.com");
		//id=user
		c.findElementById("user").sendKeys("Dhivyakarthi123");
		//name=pass
		c.findElementByName("pass").sendKeys("12345");
		//classname=btn_log
		c.findElementByClassName("btn_log").click();
	}
}
