package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdwn {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	c.get("https://courses.letskodeit.com/practice");
	WebElement ele = c.findElementById("carselect");
	/*
	 * create an object for select class
	 * pass dropdown box as input to the select object
	 * index 
	 * value
	 * visible text
	 * 
	 * only one option can be selected at time
	 * multiple options cannot be selected
	 * 
	 * 
	 * */
	Select s= new Select(ele);
	//s.selectByIndex(1);
	//s.selectByValue("benz");
	s.selectByVisibleText("Benz");
}
}
