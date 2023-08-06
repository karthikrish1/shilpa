package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	c.get("https://courses.letskodeit.com/practice");
	WebElement ele = c.findElementById("multiple-select-example");
	/*
	 * create an object for select class
	 * pass listbox as input to the select object
	 * index 
	 * value
	 * visible text
	 * 
	 * 
	 * multiple options can be selected
	 * 
	 * 
	 * */
	Select s= new Select(ele);
	s.selectByIndex(0);
	s.selectByValue("orange");
	s.selectByVisibleText("Peach");

	Thread.sleep(3000);
	//s.deselectByIndex(1);
	s.deselectAll();
}
}
