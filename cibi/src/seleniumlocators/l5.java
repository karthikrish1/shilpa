package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.get("http://www.mycontactform.com");
		//xpath: xml path language
		// relative xpath
		//absolute xpath
		
		// absolute xpath: starts with /
		// from the root to the desired element
		// copy=> copy full xpath
		///html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input
		
		//relatice xpath: starts with //
		// syntax:  //*[@locator/attribute='value']
		//id=user
		c.findElementByXPath("//*[@id='user']").sendKeys("hi");
		
		c.findElementByXPath("//*[@type='password']").sendKeys("welcome");
		
		//c.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();
		
		c.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/div/input").click();
	}

}

